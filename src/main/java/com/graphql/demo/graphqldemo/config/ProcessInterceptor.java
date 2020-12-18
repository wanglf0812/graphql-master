//package com.graphql.demo.graphqldemo.config;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Vector;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//public class ProcessInterceptor implements HandlerInterceptor{
//
//    @Override
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler)
//            throws Exception {
//        // TODO Auto-generated method stub 
//        // 指定白名单域名   http://localhost:8000,http://localhost:8000
//        List<String> whileList  = new Vector<String>(); 
//        whileList.add("http://127.0.0.1:8080");
//        whileList.add("http://localhost:8080");
//        String clientIp = httpServletRequest.getHeader("origin");
//        boolean status = false;
//        for(String ip : whileList) {
//            if(clientIp!=null&&clientIp.equals(ip)) {
//                status = true;
//                break;
//            }
//        }
//        /**
//         * 网上解决方案是httpServletResponse.setHeader("Access-Control-Allow-Origin","*");设置后发现，还是不能处理跨域问题，需要指定某一个ip，如：http://127.0.0.1:8000  
//         * */
////        httpServletResponse.setHeader("Access-Control-Allow-Origin",status?clientIp:null); 
//        httpServletResponse.setHeader("Access-Control-Allow-Origin","*");  
//
//        //响应头设置  
//        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");  
//        //响应类型
//        httpServletResponse.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");  
//        httpServletResponse.setHeader("X-Powered-By","Jetty");  
//        httpServletResponse.setHeader("Access-Control-Allow-Credentials","true");
//        httpServletResponse.setHeader("Content-Type","application/json;charset=UTF-8");
//        String method= httpServletRequest.getMethod();  
//        if (method.equals("OPTIONS")){  
//            httpServletResponse.setStatus(200);  
//            return false;  
//        }  
//  
//        System.out.println(method+",status:"+status+",clientIp:"+clientIp);  
//  
//        return true;  
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//            ModelAndView modelAndView) throws Exception {
//        // TODO Auto-generated method stub
//        
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//            throws Exception {
//        // TODO Auto-generated method stub
//        
//    }
//
//}
