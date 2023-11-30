package edu.ucan.multitenantschema.hibernate;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

/**
 *
 * Nessa classe definimos uma estrategia para identificar os nossos tenets
 * Nossos clientes irão enviar um header HTTP chamado “tenant” com a
 * informação de qual inquilino está se conectando.
 *
 */
@Component
public class TenantInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        Optional.ofNullable(request.getHeader("tenant"))
                .map(String::toUpperCase)
                .ifPresent(TenantContext::setCurrentTenant);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        TenantContext.clear();
    }
}
