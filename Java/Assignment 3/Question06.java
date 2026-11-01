// 6. Create an abstract class Vehicle with one abstract function color(). Create two sub
// classes Car and Bus from the Vehicle class. Invoke the function through the instance
// of Car and Bus. Also use the abstract class reference that invokes that function in
// main.

abstract class Vehicle {
    abstract void color();
}

class Car extends Vehicle {
    void color() {
        System.out.println("Car color is Red");
    }
}

class Bus extends Vehicle {
    void color() {
        System.out.println("Bus color is Yellow");
    }
}

class Question06 {
    public static void main(String args[]) {

        Car c = new Car();
        c.color();

        Bus b = new Bus();
        b.color();

        Vehicle v;

        v = new Car();
        v.color();

        v = new Bus();
        v.color();
    }
}