package homework150426;

public class Human implements Walker, Talker{
    @Override
    public void speak() {
        System.out.println("Robot Human Is Speaking");
    }

    @Override
    public void walk() {
        System.out.println("Robot Human Is Walking");
    }

}
