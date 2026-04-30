package homework300426.genClass;

public class PillBottleDemo {
    static void main(String[] args) {
        PainKiller painKiller = new PainKiller("Paracetamol");
        Antibiotic antibiotic = new Antibiotic("Ibuprofen");
        Vitamin vitamin = new Vitamin("B Complex");

        PillBottle<Medication> painKillerPillBottle = new PillBottle<>(painKiller);
        PillBottle<Medication> antibioticPillBottle = new PillBottle<>(antibiotic);
        PillBottle<Medication> vitaminPillBottle = new PillBottle<>(vitamin);

        System.out.println(painKillerPillBottle.getObj().getClass());
        System.out.println(painKiller.getPainkiller());
        System.out.println(antibioticPillBottle.getObj().getClass());
        System.out.println(antibiotic.getAntibiotic());
        System.out.println(vitaminPillBottle.getObj().getClass());
        System.out.println(vitamin.getVitamin());

    }
}
