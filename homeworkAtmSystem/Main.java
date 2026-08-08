package homeworkAtmSystem;

public class Main {
    static void main(String[] args) {
       AmountValidation amountValidation = new AmountValidation();
        System.out.println(amountValidation.validateWithdrawalAmount(50));
        System.out.println(amountValidation.validateWithdrawalAmount(100));
        System.out.println(amountValidation.validateWithdrawalAmount(99));
        System.out.println(amountValidation.validateWithdrawalAmount(5050));
        System.out.println(amountValidation.validateWithdrawalAmount(25000));
        System.out.println(amountValidation.validateWithdrawalAmount(4999));

        DecisionMaking decisionMaking = new DecisionMaking();
        System.out.println(decisionMaking.checksConditions(false, true, true, true));
        System.out.println(decisionMaking.checksConditions(true, false, true, true));
        System.out.println(decisionMaking.checksConditions(true, true, false, true));
        System.out.println(decisionMaking.checksConditions(true, true, true, false));
        System.out.println(decisionMaking.checksConditions(true, true, true, true));

        StateTransition stateTransition = new StateTransition();
        System.out.println(stateTransition.insertCard());
        System.out.println(stateTransition.enterPin(false));
        System.out.println(stateTransition.enterPin(false));
        System.out.println(stateTransition.enterPin(true));
        System.out.println(stateTransition.startedTransaction());
        System.out.println(stateTransition.completeTransaction());
        System.out.println(stateTransition.ejectCard());
        System.out.println(stateTransition.reset());

    }
}
