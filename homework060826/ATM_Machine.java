package homework060826;

public class ATM_Machine {

    private Card card;
    private boolean isActiveCard;

    ATM_Machine(Card card){
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    private ATM_State currentState = ATM_State.IDLE;
    private int counter = 0;

    public ATM_State insertCard(Card card){
        if ((!currentState.equals(ATM_State.IDLE))){
            return ATM_State.INVALID_TRANSACTION;
        }
        currentState = ATM_State.CARD_INSERTED;
        return currentState;
    }
    public ATM_State enterPin(int pin) {
        if (!(currentState.equals(ATM_State.CARD_INSERTED)) & !(currentState.equals(ATM_State.PIN_VERIFICATION))) {
            return ATM_State.INVALID_TRANSACTION;
        }
        if (card.getPin() == pin) {
            currentState = ATM_State.AUTHENTICATED;
            counter = 0;
            return currentState;
        }
        currentState = ATM_State.PIN_VERIFICATION;
        counter++;
        if (counter == 3) {
            isActiveCard = false;
            currentState = ATM_State.BLOCKED;
        }
        return currentState;
    }

    public ATM_State startedTransaction(){
        if (!(currentState.equals(ATM_State.AUTHENTICATED))){
            return ATM_State.INVALID_TRANSACTION;
        }
        currentState = ATM_State.TRANSACTION_IN_PROGRESS;
        return currentState;
    }
    public ATM_State completeTransaction(){
        if (!(currentState.equals(ATM_State.TRANSACTION_IN_PROGRESS))){
            return ATM_State.INVALID_TRANSACTION;
        }
        currentState = ATM_State.AUTHENTICATED;
        return currentState;
    }
    public ATM_State ejectCard(){
        if(!(currentState.equals(ATM_State.AUTHENTICATED) &&
                !(currentState.equals(ATM_State.PIN_VERIFICATION)) &&
                !(currentState.equals(ATM_State.BLOCKED)))){
            return ATM_State.INVALID_TRANSACTION;
        }
        currentState = ATM_State.CARD_EJECTED;
        return currentState;
    }

    public ATM_State reset(){
        if (currentState.equals(ATM_State.CARD_EJECTED)){
            currentState = ATM_State.IDLE;
            return currentState;

        }
        return ATM_State.INVALID_TRANSACTION;
    }

    public boolean isActiveCard() {
        return isActiveCard;
    }
}
