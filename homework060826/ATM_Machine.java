package homework060826;

public class ATM_Machine {

    private Card card;

    ATM_Machine(Card card){
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    private String currentState = ATM_State.IDLE.name();
    private int counter = 0;

    public String insertCard(){
        if ((!currentState.equals(ATM_State.IDLE.name()))){
            return "Invalid Transaction";
        }
        currentState = ATM_State.CARD_INSERTED.name();
        return currentState;
    }
    public String enterPin(boolean isCorrect) {
        if (!(currentState.equals(ATM_State.CARD_INSERTED.name())) & !(currentState.equals(ATM_State.PIN_VERIFICATION.name()))) {
            return "Invalid Transition";
        }
        if (isCorrect) {
            currentState = ATM_State.AUTHENTICATED.name();
            counter = 0;
            return currentState;
        }
        currentState = ATM_State.PIN_VERIFICATION.name();
        counter++;
        if (counter == 3) {
            currentState = ATM_State.BLOCKED.name();
        }
        return currentState;

    }

    public String startedTransaction(){
        if (!(currentState.equals(ATM_State.AUTHENTICATED.name()))){
            return "Invalid Transaction";
        }
        currentState = ATM_State.TRANSACTION_IN_PROGRESS.name();
        return currentState;
    }
    public String completeTransaction(){
        if (!(currentState.equals(ATM_State.TRANSACTION_IN_PROGRESS.name()))){
            return "Invalid Transaction";
        }
        currentState = ATM_State.AUTHENTICATED.name();
        return currentState;
    }
    public String ejectCard(){
        if(!(currentState.equals(ATM_State.AUTHENTICATED.name())) &&
                !(currentState.equals(ATM_State.PIN_VERIFICATION.name())) &&
                !(currentState.equals(ATM_State.BLOCKED.name()))){
            return "Invalid Transaction";
        }
        currentState = ATM_State.CARD_EJECTED.name();
        return currentState;
    }

    public String reset(){
        if (currentState.equals(ATM_State.CARD_EJECTED.name())){
            currentState = ATM_State.IDLE.name();
            return currentState;

        }
        return "Invalid Transaction";
    }

    public String checksConditions(boolean c1, boolean c2, boolean c3, boolean c4){
        if (!c1 ){
            return DecisionState.DENIED_ACCOUNT_BLOCKED.name();
        }
        if (!c2){
            return DecisionState.DENIED_INVALID_AMOUNT.name();
        }
        if (!c3){
            return DecisionState.DENIED_INSUFFICIENT_BALANCE.name();
        }
        if (!c4){
            return DecisionState.DENIED_LIMIT_EXCEEDED.name();
        }
        return DecisionState.APPROVED.name();
    }
}
