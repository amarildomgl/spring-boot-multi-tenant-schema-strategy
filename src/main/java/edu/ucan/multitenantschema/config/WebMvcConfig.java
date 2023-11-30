package edu.ucan.multitenantschema.config;

import edu.ucan.multitenantschema.hibernate.TenantInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Essa classe receberá por injeção de dependência a classe TenantInterceptor
 * e registrará ela como um interceptor.
 * Em Spring Boot, um "interceptor" refere-se a um mecanismo que permite que você intercepte
 * as requisições HTTP e as respostas antes de serem manipuladas pelos controladores
 * ou antes de serem enviadas de volta ao cliente.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private final TenantInterceptor tenantInterceptor;
    public WebMvcConfig(TenantInterceptor tenantInterceptor) {
        this.tenantInterceptor = tenantInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tenantInterceptor);
    }
}
