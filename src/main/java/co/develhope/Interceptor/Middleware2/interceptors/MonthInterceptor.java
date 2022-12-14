package co.develhope.Interceptor.Middleware2.interceptors;

import co.develhope.Interceptor.Middleware2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Data;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Data
@Component
public class MonthInterceptor implements HandlerInterceptor {

    List<Month> mesi = new ArrayList(){Month gennaio = new Month(1,"January", "Gennaio", "//////");
        Month febbraio = new Month(2,"Febrary", "Febbraio", "//////");
        Month marzo = new Month(3,"March", "Marzo", "//////");
        Month aprile = new Month(4,"April", "Aprile", "///////");
        Month maggio = new Month(5,"May", "Maggio", "//////");
        Month giugno = new Month(6,"June", "Giugno", "//////");};



    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Character ch = request.getRequestURI().charAt(request.getRequestURI().length()-1);

        if(!Character.isDigit(ch)){
            response.setStatus(400);
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
