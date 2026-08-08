package homework060826;

public class Card {
    private int balance;
    private String cardNumber;
    private int pin;
    private final int dailyWithdrawn = 50000;
    private static int dailywithdrawalamount = 0;

    public Card(int balance, String cardNumber, int pin){
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String validateWithdrawalAmount(int amount){
        if (amount < 100){
            return AmountValidation.TOO_LOW.name();
        }
        if (amount > 20000){
            return AmountValidation.TOO_HIGH.name();
        }
        if (amount % 100 != 0){
            return AmountValidation.NOT_MULTIPLE_OFF_100.name();
        }
        balance = balance - amount;
        dailywithdrawalamount = dailywithdrawalamount + amount;
        if (dailywithdrawalamount > dailyWithdrawn){
            return "The daily limit has been reached";
        }
        return AmountValidation.VALID.name();
    }

    public int getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public int getPin() {
        return pin;
    }
}
