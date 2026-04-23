package homework180426.exceptions;

public class InsufficientFundsException extends Exception{
    private double withdrawAmount;
    public InsufficientFundsException(double withdrawAmount){
        super("Withdraw Amount Is More Than Balance " + withdrawAmount);
        this.withdrawAmount = withdrawAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }
}
