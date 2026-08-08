package homeworkAtmSystem;

public class StateTransition {
    private final String state1 = "IDLE";
    private final String state2 = "CARD_INSERTED";
    private final String state3 = "PIN_VERIFICATION";
    private final String state4 = "AUTHENTICATED";
    private final String state5 = "TRANSACTION_IN_PROGRESS";
    private final String state6 = "BLOCKED";
    private final String state7 = "CARD_EJECTED";
    private String currentState = state1;
    private int counter = 0;

    public String insertCard(){
        if ((!currentState.equals(state1))){
            return "Invalid Transaction";
        }
        currentState = state2;
        return currentState;
    }
    public String enterPin(boolean isCorrect) {
        if (!(currentState.equals(state2)) & !(currentState.equals(state3))) {
            return "Invalid Transition";
        }
        if (isCorrect) {
            currentState = state4;
            counter = 0;
            return currentState;
        }
        currentState = state3;
       counter++;
        if (counter == 3) {
            currentState = state6;
        }
        return currentState;

    }

    public String startedTransaction(){
        if (!(currentState.equals(state4))){
            return "Invalid Transaction";
        }
        currentState = state5;
        return currentState;
    }
    public String completeTransaction(){
        if (!(currentState.equals(state5))){
            return "Invalid Transaction";
        }
        currentState = state4;
        return currentState;
    }
    public String ejectCard(){
        if(!(currentState.equals(state4)) && !(currentState.equals(state3)) && !(currentState.equals(state6))){
            return "Invalid Transaction";
        }
        currentState = state7;
        return currentState;
    }

    public String reset(){
        if (currentState.equals(state7)){
            currentState = state1;
            return currentState;

        }
        return "Invalid Transaction";
    }

    public String getState1() {
        return state1;
    }

    public String getState2() {
        return state2;
    }

    public String getState3() {
        return state3;
    }

    public String getState4() {
        return state4;
    }

    public String getState5() {
        return state5;
    }

    public String getState6() {
        return state6;
    }

    public String getState7() {
        return state7;
    }

    public int getCounter() {
        return counter;
    }

    public String getCurrentState() {
        return currentState;
    }
}
