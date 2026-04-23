import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        boolean running = true;

        while (running){
            
            System.out.println("\n=== BANK SYSTEM ===");
            System.out.println("1 - Create Account");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Check Balance");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option){

                case 1:
                    System.out.println("Enter account holder name: ");
                    String name = sc.nextLine();
                    bank.createAccount(name);
                    System.out.println("Account created sucessfully!");
                    break;

                case 2:
                    if (bank.getAccount() == null){
                        System.out.println("Create an account first.");
                        break;
                    }

                    System.out.println("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    bank.getAccount().deposit(depositAmount);
                    break;

                case 3:
                    if (bank.getAccount() == null){
                        System.out.println("Create an account first.");
                        break;
                    }
                    System.out.println("Enter withdraw amount: ");
                    double withdrawAmmount = sc.nextDouble();
                    bank.getAccount().withdraw(withdrawAmmount);
                    break;

                case 4:
                    if (bank.getAccount() == null){
                        System.out.println("Create an account first.");
                        break;
                    }
                    
                    System.out.println("Account holder: " + 
                        bank.getAccount().getAccountHolder()
                    );
                    System.out.println("Current balance: $" + 
                        bank.getAccount().getBalance()
                    );
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }


        }



        sc.close();
    }
}
