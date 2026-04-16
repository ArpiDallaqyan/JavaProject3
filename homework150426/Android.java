package homework150426;

public class Android implements Walker, Talker, Cleaner{
    @Override
    public void walk() {
        System.out.println("Robot Android Is Walking");
    }

    @Override
    public void speak() {
        System.out.println("Robot Android Is Speaking");
    }

    @Override
    public void clean() {
        System.out.println("Robot Android Is Cleaning");
    }

}
