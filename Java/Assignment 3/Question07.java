// 7. Create an abstract class Animals with two abstract methods eat() and makeNoise().
// Create a class Cats where makeNoise() method is overridden which prints "Cats
// meow" and a class Dogs where makeNoise() method is overridden which prints
// "Dogs bark", both inheriting the class Animals. Now create an object for each of the
// subclasses and call their respective methods.

abstract class Animals {
    abstract void eat();

    abstract void makeNoise();
}

class Cats extends Animals {
    @Override
    void eat() {
        System.out.println("Cats eat fish");
    }

    @Override
    void makeNoise() {
        System.out.println("Cats meow");
    }
}

class Dogs extends Animals {
    @Override
    void eat() {
        System.out.println("Dogs eat meat");
    }

    @Override
    void makeNoise() {
        System.out.println("Dogs bark");
    }
}

class Question07 {
    public static void main(String args[]) {

        Cats c = new Cats();
        c.eat();
        c.makeNoise();

        Dogs d = new Dogs();
        d.eat();
        d.makeNoise();
    }
}