import com.google.inject.Inject;

public class BillingService {

  private final CreditCardProcessor creditCardProcessor;
  private final TransactionLog transactionLog;

  @Inject BillingService(CreditCardProcessor processor, TransactionLog log) {
    this.creditCardProcessor = processor;
    this.transactionLog = log;
  }

  public void bill() {
    System.out.println("Here is your bill, sir.");
  }

  public void charge() {
    this.creditCardProcessor.chargeCard();
  }

  public void log() {
    this.transactionLog.logTransaction();
  }
}
