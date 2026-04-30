package homework180426.exceptions;

public class User {
    static void main(String[] args) {
        BankAccount account1 = new BankAccount(150000);
        try {
            account1.withdraw(200000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage() );
        }

    }
}
