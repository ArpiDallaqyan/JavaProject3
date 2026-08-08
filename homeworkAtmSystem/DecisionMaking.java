package homeworkAtmSystem;

public class DecisionMaking {

    public String checksConditions(boolean c1, boolean c2, boolean c3, boolean c4){
        if (!c1 ){
            return "DENIED_ACCOUNT_BLOCKED";
        }
        if (!c2){
            return "DENIED_INVALID_AMOUNT";
        }
        if (!c3){
            return "DENIED_INSUFFICIENT_BALANCE";
        }
        if (!c4){
            return "DENIED_LIMIT_EXCEEDED";
        }
            return "APPROVED";
    }
}
