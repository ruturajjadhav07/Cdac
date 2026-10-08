// 7. Create a generic class Pair&lt;K, V&gt; to store a key and its corresponding value. The class
// should contain methods to set and get the key and value. In the main() method, create
// objects to store the following information and display them:
//  Student ID and Student Name
//  Product ID and Product Price
//  Employee ID and Employee Name
// Also, write a method display() in the generic class to display the key-value pair.

class Pair<K, V> {
    K key;
    V value;

    void setKey(K key) {
        this.key = key;

    }

    void setValue(V value) {
        this.value = value;
    }

    K getkey() {
        return key;
    }

    V getValue() {
        return value;
    }

    void display() {
        System.out.println("Key : " + key);
        System.out.println("Value : " + value);
        System.out.println();

    }
}

class Question7 {
    public static void main(String[] args) {
        Pair<Integer, String> student = new Pair<Integer, String>();
        student.setKey(101);
        student.setValue("Ruturaj");

        Pair<Integer, Integer> product = new Pair<Integer, Integer>();
        product.setKey(201);
        product.setValue(10000);

        Pair<Integer, String> Employee = new Pair<Integer, String>();
        Employee.setKey(1);
        Employee.setValue("Jadhav Ruturaj");

        System.out.println("Student Details");
        student.display();

        System.out.println("Product Details");
        product.display();

        System.out.println("Employee Details");
        Employee.display();
    }
}