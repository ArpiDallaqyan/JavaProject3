package homework150426;

public class VacuumCleaner implements Walker, Cleaner{
    @Override
    public void walk() {
        System.out.println("Robot Vacuum Cleaner Is Walking");
    }

    @Override
    public void clean() {
        System.out.println("Robot Vacuum Cleaner Is Cleaning");
    }

}
