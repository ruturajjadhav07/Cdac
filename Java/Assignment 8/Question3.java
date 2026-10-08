// 3. Create Product class with data members id, name, category and price and write two
// constructors, one default and other parametrized.
// Create a list of Products and do the following operations using Stream.
// a) Get a list of products which belongs to category “Books” with price > 100.
// b) Get the total no: of products.
// c) Find the total price of all products.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    String category;
    double price;

    Product() {
        id = 100;
        name = "Banana";
        category = "Fruit";
        price = 16;
    }

    Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}

class Question3 {
    public static void main(String args[]) {
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product()); // default fruit product
        prod.add(new Product(101, "Book1", "Books", 430.00));
        prod.add(new Product(102, "Book2", "Books", 230.00));
        prod.add(new Product(103, "Book3", "Books", 130.00));
        prod.add(new Product(104, "Phone", "Electronics", 43000.00));

        System.out.println("All products: " + prod);

        List<Product> bookProducts = prod.stream()
                .filter(product -> product.category.equalsIgnoreCase("Books") && product.price > 100)
                .collect(Collectors.toList());

        long totalProducts = prod.stream().count();
        double totalPrice = prod.stream().mapToDouble(product -> product.price).sum();

        System.out.println("Products in Books category with price > 100:");
        System.out.println(bookProducts);

        System.out.println("Total number of products: " + totalProducts);
        System.out.println("Total price of all products: " + totalPrice);
    }
}