package homework150426;

public class RobotDemo {
    static void main(String[] args) {
        MorningRoutine method = new MorningRoutine();
        Cleaner androidCleaner  = new Android();
        Talker androidTalker = new Android();
        method.performMorningRoutine(androidCleaner, androidTalker);
        Cleaner vacuumCleaner = new VacuumCleaner();
        method.performMorningRoutine(vacuumCleaner, androidTalker);
    }

    }

