package homework230426.airline;

public class UnderAgeException extends Exception{
    UnderAgeException(){
        super("Under Age Exception, Age Can Be Only 18 and more");
    }
}
