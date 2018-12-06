package com.gemini.pattern.delegate;

import com.gemini.pattern.delegate.controller.MemberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.delegate.controller
 * @classname: ServletDispatcher
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/6 11:03
 */
public class ServletDispatcher {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    private ServletDispatcher() {
        try {
            Class<?> classzz = MemberAction.class;
            handlerMapping.add(new Handler()
                    .setController(classzz.newInstance())
                    .setMethod(classzz.getMethod("getMemberId", new Class[]{String.class}))
                    .setUrl("/member/getById"));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response) {
        doDistacher(request, response);
    }

    private void doDistacher(HttpServletRequest request, HttpServletResponse response) {
        // 1/获取用户的请求
        String uri = request.getRequestURI();
        //2 servlet拿到url 要做权衡和判断，根据用户的请求，找到这个URL对应的某一个Java方法
        Handler handler = null;
        //3.url匹配
        for (Handler handlerTemp : handlerMapping) {
            if (handlerTemp.getUrl().equals(uri)) {
                handler = handlerTemp;
                break;
            }
        }
        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.controller, request.getParameterMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //4.将结果写回
        try {
            response.getWriter().write(object.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Handler {
        private Object controller;
        private String url;
        private Method method;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }
    }
}
