import com.google.inject.Guice;
import com.google.inject.Injector;

public class BillingServiceRunner {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new BillingModule());

    BillingService billingService = injector.getInstance(BillingService.class);
    billingService.bill();
    billingService.charge();
    billingService.log();
  }
}
