package edu.ucan.multitenantschema.hibernate;
/**
 *
 * Nessa classe manipulamos a ThreadLocal da aplicação
 * atribuindo um inquilino padrão chamado “tenant01”
 * e deixamos disponíveis métodos para ler, atribuir ou limpar o inquilino.
 *
 */
public class TenantContext {

    private static final String DEFAULT_TENANT = "tenant01";
    private static final ThreadLocal<String> currentTenant = ThreadLocal.withInitial(() -> DEFAULT_TENANT);

    public static void setCurrentTenant(String tenant) {
        currentTenant.set(tenant);
    }

    public static String getCurrentTenant() {
        return currentTenant.get();
    }

    public static void clear() {
        currentTenant.remove();
    }
}
