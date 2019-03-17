package love.programming;

public class Book {

    String bookGenre;
    String bookName;
    int noOfPages;

    public Book() {
//        bookGenre = "fiction";
//        bookName = "geek girl";
//        noOfPages = 100;
//
//        System.out.println("Without args: " + bookGenre);
//        System.out.println("Without args: " + bookName);
//        System.out.println("Without args: " + noOfPages);
    }

    public Book(String bookGenre) {
        System.out.println("With 1 args: " + bookGenre);
    }

    public Book(String bookGenre, String bookName) {
        System.out.println("With 2 args: " + bookGenre);
        System.out.println("With 2 args: " + bookName);
    }

    public Book(String bookGenre, String bookName, int noOfPages) {
        System.out.println("With 3 args: " + bookGenre);
        System.out.println("With 3 args: " + bookName);
        System.out.println("With 3 args: " + noOfPages);

    }
}




