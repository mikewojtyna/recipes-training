package pl.wojtyna.trainings.recipes.order;

public class SpecialTenantDiscount implements Discount {

    private final CurrentTenantProvider tenantProvider;

    public SpecialTenantDiscount(CurrentTenantProvider tenantProvider) {
        this.tenantProvider = tenantProvider;
    }

    @Override
    public TotalCost apply(OrderSnapshot orderSnapshot) {
        if (tenantProvider.currentTenant().equals("special")) {
            // ...
            return TotalCost.of(...);
        }
    }
}
