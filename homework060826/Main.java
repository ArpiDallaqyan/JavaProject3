package homework060826;

public class Main {
    static void main(String[] args) {
        Card card1 = new Card(152000, "1659240015485678", 1659);
        Card card2 = new Card(98000, "4318290046598765", 1999);
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
        System.out.println(atm_machine.insertCard(card1));
        System.out.println(atm_machine.enterPin(1548));
        System.out.println(atm_machine.enterPin(1459));
        System.out.println(atm_machine.enterPin(1659));
        System.out.println(atm_machine.startedTransaction());
        System.out.println(atm_machine.completeTransaction());
        System.out.println(atm_machine.ejectCard());
        System.out.println(atm_machine.reset());
        ATM_Machine atm_machine1 = new ATM_Machine(card2);
        System.out.println(atm_machine1.insertCard(card2));
        System.out.println(atm_machine1.enterPin(1548));
        System.out.println(atm_machine1.enterPin(1548));
        System.out.println(atm_machine1.enterPin(1548));

    }
}
