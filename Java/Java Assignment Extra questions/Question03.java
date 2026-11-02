// 3. Create a class named Car with a default constructor which initializes the instance
// variable model with the value “Ford”. Write a parametrized constructor also to
// initialize model. Write a getModel() method to print the value of model. Create two
// objects for the class using two constructors and invoke the getModel()method.

class Car {
    private String model;

    public Car() {
        model = "Ford";
    }

    public Car(String model) {
        this.model = model;
    }

    public void getModel() {
        System.out.println("Model name is: " + model);
    }
}

class Question03 {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new Car("Totoya");

        c1.getModel();
        c2.getModel();
    }
}