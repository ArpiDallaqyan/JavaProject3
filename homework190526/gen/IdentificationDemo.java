package homework190526.gen;

public class IdentificationDemo {
    static void main(String[] args) {
        User [] users = {new User(15), new User(4), new User(26), new User(35)};
        Integer id = returnIdOfArray(users);
        Student [] students = {new Student("a1"), new Student("a2"), new Student("a3"),
                new Student("a4"), new Student("a5")};
        String id2 = returnIdOfArray(students);


    }
    public static <E extends Identifiable<R>, R > R returnIdOfArray( E [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId());
        }
        return arr[0].getId();

        }
    }

