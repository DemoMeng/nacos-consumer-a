package com.mqz.nacos.consumer.a.handler;

import com.mqz.mars.base.thread.LocalContext;
import com.mqz.nacos.consumer.a.common.Constants;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/11/10
 */
public class AccessInterceptor implements HandlerInterceptor {


    private static List<String> docUrlList;
    static {
        List<String> list = new ArrayList<>();
        list.add("/doc.html");
        list.add("/swagger-ui.html");
        docUrlList = Collections.unmodifiableList(list);
    }

    /**
     * TODO  token过滤
     * 每个模块中需要有个token拦截器，因为所有的请求被网关模块解析了，网关模块主要就是把token解析，解析出来的信息重新拼接到url上，
     * 然后每个模块就从url获取参数，也就是如下： request.getParameter(CommonConstants.COMPANY_ID)
     * 然后再把这些参数放到ThreadLocal中，问：是不是也能放到request中？
     *
     * ThreadLocal：解决的高并发下的问题，本地线程，每个线程独享一个ThreadLocal，但是如果使用不当（没有调用 ThreadLocal.remove的方法），可能出现内存泄漏的情况！
     *
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        //维护网关解析的变量到本地线程
        String userId = request.getParameter("GATEWAY_USER_ID");
        if(!StringUtils.isEmpty(userId)){
            LocalContext.add(Constants.GATEWAY_KEY.USER_ID,userId);
        }
        String userName = request.getParameter("GATEWAY_USER_NAME");
        if(!StringUtils.isEmpty(userName)){
            LocalContext.add(Constants.GATEWAY_KEY.USER_NAME,userName);
        }
        //链路追踪维护
        return true;
    }

    /**
     * 返回json
     * @param response
     * @param json
     */
    private void returnJson(HttpServletResponse response, String json){
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);
        } catch (IOException e) {
        } finally {
            if (writer != null){
                writer.close();
            }
        }
    }
}
