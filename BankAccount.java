public class BankAccount {
  private  String accountHolder;
  private  double balance;

  public BankAccount(String accountHolder) {
    this.accountHolder = accountHolder;
    this.balance = 0.0;
  }

  public void deposit(double amount){

    if (amount > 0){
      balance += amount;
      System.out.println("Deposit sucessful.");
    }else{
      System.out.println("Invalid amount.");
    }
  }

  public void withdraw(double amount){
    if (amount > 0 && amount <= balance){
      balance -= amount;
      System.out.println("Withdraw sucessful");
    }else{
      System.out.println("Insufficient funds or invalid amount");
    }
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public double getBalance() {
    return balance;
  }

}
