public class Bank {
    private BankAccount account;

    public void createAccount(String name){
        if (account == null){
            account = new BankAccount(name);
        }else{
            System.out.println("An account already exists.");
        }
    }

    public BankAccount getAccount(){
        return account;
    }
}
