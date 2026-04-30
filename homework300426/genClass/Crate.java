package homework300426.genClass;

public class Crate <T>{
    private T obj;

    public Crate(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    public void pack(){
        System.out.println("Packed");
    }
    public void unpack(){
        System.out.println("Unpacked");
    }
}
