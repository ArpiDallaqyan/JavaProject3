package Homework_02_04_26;

public class App {
    static void main(String[] args) {
        DummyApp dummyApp = new DummyApp("Ani", "Liana");
        System.out.println("Duration Of Call: " + dummyApp.getDuration());
        dummyApp = null;
        DummyAppPro dummyAppPro = new DummyAppPro("Anna", "Alica" , "Ani");
        dummyAppPro.turnOnVideo();
        System.out.println("Is Camera Turn On: " + dummyAppPro.isCameraTurnOn);
        dummyAppPro.turnOffVideo();
        System.out.println("Is Camera Turn On: " + dummyAppPro.isCameraTurnOn);
        dummyAppPro = null;
        DummyAppProMax dummyAppProMax = new DummyAppProMax("Aram", "Gor", "Lia", "Eva");
        System.out.println("Is Shared Display: " + dummyAppProMax.isSharedDisplay(dummyAppPro));
        dummyAppProMax = null;
    }
}
