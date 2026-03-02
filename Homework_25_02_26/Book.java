package Homework_25_02_26;

class Book {
    String title ;
    String author ;
    int yearPublished ;

    Book(String t, String a, int y){
        title = t;
        author = a;
        yearPublished = y;
    }
    Book(){

    }
    void displayInfo(){
        System.out.println("The Title Of Book Is " + title);
        System.out.println("The Author Of Book Is " + author);
        System.out.println("The Published Year Of Book  Is " + yearPublished);
    }
}
