package homework030426;

    public class DummyAppProMax extends DummyAppPro {
        boolean isSharedDisplay;

     DummyAppProMax(String[] members) {
        super(members);
        if (members.length > 8) {
            throw new IllegalArgumentException("Not More Than 8 Members");
        }
        else {
            this.members = members;
        }
    }

        public boolean ShareDisplay(){
            System.out.println("Share Display");
            isSharedDisplay = true;
            return true;
        }

    }
