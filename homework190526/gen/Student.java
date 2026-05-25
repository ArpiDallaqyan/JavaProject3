package homework190526.gen;

public class Student implements Identifiable<String>{
    private String id;
    Student(String id){
        this.id = id;
    }
    @Override
    public String getId() {
        return id;
    }
}
