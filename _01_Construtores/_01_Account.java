package _01_Construtores;

public class _01_Account {

  // ATTRIBUTES
  private int accountNumber;
  private String accountNameHolder;
  private double balance;

  private final double WITHDRAWAL_FEE = 5;


  public _01_Account(int accountNumber, String accountNameHolder) {
    this.accountNumber = accountNumber;
    this.accountNameHolder = accountNameHolder;
  }

  // CONSTRUCTORS, SETTERS AND GETTERS
  public _01_Account(int accountNumber, String accountNameHolder, double initialDeposit) {
    this.accountNumber = accountNumber;
    this.accountNameHolder = accountNameHolder;
    this.balance = initialDeposit;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getAccountNameHolder() {
    return accountNameHolder;
  }

  public double getBalance(){
    return balance;
  }

  public void setAccountNameHolder(String accountNameHolder) {
    this.accountNameHolder = accountNameHolder;
  }

  // METHODS

  public void depositAmount(double deposit){
    balance += deposit;
  }

  public void withdrawAmount(double withdraw){
    if (balance > WITHDRAWAL_FEE){
      balance -= (withdraw + WITHDRAWAL_FEE);
    }
  }

  @Override
  public String toString() {
    return "Account: " +
            accountNumber + ", " +
            "Holder: " +
            accountNameHolder + ", " +
            "Balance: " +
            String.format("%.2f", balance);
  }
}
