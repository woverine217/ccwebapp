//package Intercaptor;
//
//import POJO.User;
//import com.fasterxml.jackson.databind.util.JSONPObject;
//import com.sun.org.apache.xml.internal.utils.Constants;
//
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.lang.reflect.Method;
//
//
//public class AuthorizationInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
//
//        String requestURI= request.getRequestURI();
////        HandlerMethod  handlerMethod = (HandlerMethod)o;
////        Method method = handlerMethod.getMethod();
//
//        String token = request.getHeader("token");
//        if(!requestURI.contains("/v1/use/self") ){
//            if(token.equals("hahah")) {
//                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                return false;
//            }return true;
//
//        }return true;
//
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//            if(httpServletResponse==null){
//                httpServletResponse.setStatus(400);
//            }
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//
//    }
//}
