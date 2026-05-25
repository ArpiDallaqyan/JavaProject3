package homework190526.gen;

public class User implements Identifiable<Integer>{
    private int id;
    User(int id){
        this.id = id;
    }
    @Override
    public Integer getId() {
        return id;
    }
}
