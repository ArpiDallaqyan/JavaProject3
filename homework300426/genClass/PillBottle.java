package homework300426.genClass;

public class PillBottle <T extends Medication> {
    private T obj;

    PillBottle(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
