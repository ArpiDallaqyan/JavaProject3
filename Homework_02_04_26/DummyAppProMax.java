package Homework_02_04_26;

public class DummyAppProMax extends DummyAppPro{
    boolean isSharedDisplay;

    DummyAppProMax(String name1, String name2){
        super(name1, name2);
    }

    DummyAppProMax(String name1, String name2, String name3){
        super(name1, name2, name3);
    }

    DummyAppProMax(String name1, String name2, String name3, String name4) {
        super(name1, name2, name3, name4);
    }

    DummyAppProMax(String name1, String name2, String name3, String name4, String name5) {
        super(name1, name2, name3, name4, name5);
    }

    DummyAppProMax(String name1, String name2, String name3, String name4, String name5,
                String name6) {
        super(name1, name2, name3, name4, name5, name6);

    }

    DummyAppProMax(String name1, String name2, String name3, String name4, String name5,
                String name6, String name7) {
        super(name1, name2, name3, name4, name5, name6, name7);
    }

    DummyAppProMax(String name1, String name2, String name3, String name4, String name5,
                String name6, String name7, String name8) {
        super(name1, name2,name3, name4, name5, name6, name7, name8);

    }

    DummyAppProMax(String name1, String name2, String name3, String name4, String name5,
                String name6, String name7, String name8, String name9) {
        super(name1, name2, name3, name4, name5, name6, name7, name8, name9);
    }

    DummyAppProMax(String name1, String name2, String name3, String name4, String name5,
                String name6, String name7, String name8, String name9, String name10) {
        super(name1, name2, name3, name4, name5, name6, name7, name8, name9, name10);

    }
    public boolean isSharedDisplay(DummyApp obj){
        System.out.println("Share Display");
        isSharedDisplay = true;
        return true;
    }

}
