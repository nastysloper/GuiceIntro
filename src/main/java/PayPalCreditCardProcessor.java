public class PayPalCreditCardProcessor extends CreditCardProcessor {

  @Override
  public void chargeCard() {
    System.out.println("Your PayPal account has been charged.");
  }
}
