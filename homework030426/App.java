package homework030426;
public class App {
    static void main(String[] args) {
        DummyApp dummyApp = new DummyApp("Ani", "Liana");
        dummyApp.turnOffCall();
        System.out.println("Duration Of Call: " + dummyApp.getDuration());
        dummyApp = null;
        System.out.println("----------------------");
        String[] members2 = {"Ani", "Liana", "Anna", "Alica", "Diana", "Gor", "Aram"};
        DummyAppPro dummyAppPro = new DummyAppPro(members2);
        dummyAppPro.turnOnVideo();
        System.out.println("Is Camera Turn On: " + dummyAppPro.getCameraTurnOn());
        dummyAppPro.turnOffVideo();
        System.out.println("Is Camera Turn On: " + dummyAppPro.getCameraTurnOn());
        dummyAppPro = null;
        System.out.println("----------------------");
        String[] members3 = {"Ani", "Liana", "Anna", "Alica", "Diana", "Gor", "Aram"};
        DummyAppProMax dummyAppProMax = new DummyAppProMax(members3);
        System.out.println("Is Shared Display: " + dummyAppProMax.ShareDisplay());
        dummyAppProMax = null;
    }

}