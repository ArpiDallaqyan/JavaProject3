package homework300426.genClass;

public class CrateDemo {
    static void main(String[] args) {
        Fruits fruit1 = new Fruits("Apple");
        Crate<Fruits> fruitsCrate1 = new Crate<>(fruit1);
        String f = fruitsCrate1.getObj().getFruit();
        System.out.println(f);
        fruitsCrate1.pack();
        fruitsCrate1.unpack();
        Vegetables vegetables1 = new Vegetables("Potato");
        Crate<Vegetables> vegetablesCrate1 = new Crate<>(vegetables1);
        String v = vegetablesCrate1.getObj().getVegetable();
        System.out.println(v);
        vegetablesCrate1.pack();
        vegetablesCrate1.unpack();




    }
}
