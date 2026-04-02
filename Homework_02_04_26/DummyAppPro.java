package Homework_02_04_26;

    public class DummyAppPro extends DummyApp{
        String name3;
        String name4;
        String name5;
        String name6;
        String name7;
        String name8;
        String name9;
        String name10;
        boolean isCameraTurnOn;

        DummyAppPro(String name1, String name2){
            super(name1, name2);
        }

        DummyAppPro(String name1, String name2, String name3){
            super(name1, name2);
            this.name3 = name3;
        }

        DummyAppPro(String name1, String name2, String name3, String name4) {
            super(name1, name2);
            this.name3 = name3;
            this.name4 = name4;
        }

        DummyAppPro(String name1, String name2, String name3, String name4, String name5) {
            super(name1, name2);
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
        }

        DummyAppPro(String name1, String name2, String name3, String name4, String name5,
                    String name6) {
            super(name1, name2);
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
            this.name6 = name6;
        }

        DummyAppPro(String name1, String name2, String name3, String name4, String name5,
                    String name6, String name7) {
            super(name1, name2);
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
            this.name6 = name6;
            this.name7 = name7;
        }

        DummyAppPro(String name1, String name2, String name3, String name4, String name5,
                    String name6, String name7, String name8) {
            super(name1, name2);
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
            this.name6 = name6;
            this.name7 = name7;
            this.name8 = name8;
        }

        DummyAppPro(String name1, String name2, String name3, String name4, String name5,
                    String name6, String name7, String name8, String name9) {
            super(name1, name2);
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
            this.name6 = name6;
            this.name7 = name7;
            this.name8 = name8;
            this.name9 = name9;
        }

        DummyAppPro(String name1, String name2, String name3, String name4, String name5,
                    String name6, String name7, String name8, String name9, String name10) {
            super(name1, name2);
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
            this.name6 = name6;
            this.name7 = name7;
            this.name8 = name8;
            this.name9 = name9;
            this.name10 = name10;
        }

        public void turnOnVideo(){
            System.out.println("You are turn on video");
            isCameraTurnOn = true;
        }

        public void turnOffVideo(){
            System.out.println("You are turn off video");
            isCameraTurnOn = false;
        }

    }

