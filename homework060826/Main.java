package homework060826;

public class Main {
    static void main(String[] args) {
        Card card1 = new Card(152000, "1659240015485678", 1659);
        ATM_Machine atm_machine = new ATM_Machine(card1);
        System.out.println(card1.validateWithdrawalAmount(15000));
        System.out.println(card1.validateWithdrawalAmount(50));
        System.out.println(card1.validateWithdrawalAmount(100));
        System.out.println(card1.validateWithdrawalAmount(99));
        System.out.println(card1.validateWithdrawalAmount(5050));
        System.out.println(card1.validateWithdrawalAmount(25000));
        System.out.println(card1.validateWithdrawalAmount(4999));
        System.out.println(card1.validateWithdrawalAmount(15000));
        System.out.println(card1.validateWithdrawalAmount(15000));
        System.out.println(card1.validateWithdrawalAmount(15000));
        System.out.println(card1.getBalance());
        System.out.println(atm_machine.checksConditions(false, true, true, true));
        System.out.println(atm_machine.checksConditions(true, false, true, true));
        System.out.println(atm_machine.checksConditions(true, true, false, true));
        System.out.println(atm_machine.checksConditions(true, true, true, false));
        System.out.println(atm_machine.checksConditions(true, true, true, true));
        System.out.println(atm_machine.insertCard());
        System.out.println(atm_machine.enterPin(false));
        System.out.println(atm_machine.enterPin(false));
        System.out.println(atm_machine.enterPin(true));
        System.out.println(atm_machine.startedTransaction());
        System.out.println(atm_machine.completeTransaction());
        System.out.println(atm_machine.ejectCard());
        System.out.println(atm_machine.reset());

    }
}
