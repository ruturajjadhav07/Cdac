// 11. Create a class named Book with data members title, author and price. Write a no argument
// constructor which initializes the instance variables with some values and a
// parameterized constructor also to initialize variables with user input. Write a function for
// displaying the details. Create two objects for the class using two constructors and invoke
// the display function

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Wings of Fire";
        author = "A.P.J. Abdul Kalam";
        price = 250.0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}

class Question11 {
    public static void main(String args[]) {

        Book b1 = new Book();

        Book b2 = new Book("Harry Potter", "J.K. Rowling", 500.0);

        System.out.println("Book 1 Details:");
        b1.display();

        System.out.println("Book 2 Details:");
        b2.display();
    }
}