package Homework_08_03_26;

public class Author {
        String name;
         int birthYear;
        Author(String name, int birthYear){
            this.name = name;
            this.birthYear = birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    class Book {
        private String title;
        private Author author;
        private int pages;
        private int publishYear;
        private int price;
        private String genre;

        Book(String title, Author author, int publishYear){
            this.title = title;
            this.author = author;
            this.publishYear = publishYear;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public Author getAuthor() {
            return author;
        }

        public void setPublishYear(int publishYear) {
            this.publishYear = publishYear;
        }

        public int getPublishYear() {
            return publishYear;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getPages() {
            return pages;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getGenre() {
            return genre;
        }

        static class Helper {
            public void checksPages(Book book) {
                if (book.getPages() > 400) {
                    System.out.println("True");
                }
            }
            int totalTime;
            public void returnTotalTime(Book book){
                totalTime = book.getPages() * 3;

            }
            public void printInformationOfBook(Book book){
                System.out.println("Pages: " + book.getPages() );
                System.out.println("Author name: " + book.getAuthor().getName());
                System.out.println("Author Birth Year: " + book.getAuthor().getBirthYear());
                System.out.println("Genre Of Book: " + book.getGenre());
                System.out.println("Price Of Book: " + book.getPrice());
                System.out.println("Title Of Book: " + book.getTitle());
                System.out.println("Publish Year Of Book: " + book.getPublishYear());


           }
            public static void printBooksByAuthor(Book[] books, String authorName) {

                for (Book book : books) {
                    if (book.author.name.equals(authorName)) {
                        System.out.println("It Is The Book Of Author" + book.title);
                    }
                }

            }
                    }
                }

