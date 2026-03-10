package Homework_08_03_26;

import static Homework_08_03_26.Book.Helper.printBooksByAuthor;

public class Main {
    static void main(String[] args) {
        Author a1 = new Author("Jack London", 1876);
        Author a2 = new Author("Mark Twain", 1835);
        Author a3 = new Author("George Orwell", 1935);
        Author a4 = new Author("William Golding", 1926);
        Author a5 = new Author("Charlotte Bronte", 1847);

        Book[] books = {
                new Book("White Fang", a1, 1849),
                new Book("Tom Sawyer",a2, 1954)
        };

        printBooksByAuthor(books, "Mark Twain");

        Book.Helper helper = new Book.Helper();

        Book book1 = new Book("Jany Eyre", a1, 1867);
        Book book2 = new Book("1984", a3, 1949);
        Book book3 = new Book("Lord Of The Files", a4, 1954);
        book1.setPages(495);
        book1.setPrice(3500);
        book1.setGenre("novel");
        helper.checksPages(book1);
        helper.printInformationOfBook(book1);
        helper.returnTotalTime(book1);
        System.out.println("Total Time: " + helper.totalTime );


    }
}
