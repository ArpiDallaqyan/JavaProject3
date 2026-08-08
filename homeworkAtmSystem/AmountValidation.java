package homeworkAtmSystem;

public class AmountValidation {

    public String validateWithdrawalAmount(int amount){
        if (amount < 100){
            return "TOO_LOW";
        }
        if (amount > 20000){
            return "TOO_HIGH";
        }
        if (amount % 100 != 0){
            return "NOT_MULTIPLE_OF_100";
        }
        return "VALID";
    }
}
