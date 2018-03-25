public class DatabaseTransactionLog extends TransactionLog {

  @Override
  public void logTransaction() {
    System.out.println("You logged a transaction to the database.");
  }
}
