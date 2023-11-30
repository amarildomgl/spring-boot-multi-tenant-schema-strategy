package edu.ucan.multitenantschema.hibernate;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

/**
 *
 * Nessa classe criamos uma implementação de CurrentTenantIdentifierResolver do hibernate
 * Essa classe precisa ser um Bean na nossa aplicação, por isso anotamos ela com @Component
 * e na implementação do método resolveCurrentTenantIdentifier utilizamos
 * a classe TenantContext para obter o inquilino.
 *
 */
@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {
        return TenantContext.getCurrentTenant();
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
