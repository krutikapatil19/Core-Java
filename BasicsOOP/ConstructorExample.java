package BasicsOOP;
class Book {
    String title;
    String author;

    //Default constructor (no parameters)
    Book() {
        title = "Unknown";
        author = "Unknown";
    }

    //Paramterized Constructor (with parameters)
    Book(String t, String a) {
        title = t;
        author = a;
    }

    void showBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        //Using default constructor 
        Book b1 = new Book();
        b1.showBook();

        //Using parameterized constructor
        Book b2 = new Book("Wings of Fire", "APJ Abdul Kalam");
        b2.showBook();
    }
}