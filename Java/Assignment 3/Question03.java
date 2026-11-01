// 3. Create a class A with the method dispmsg() which prints some message. Create one
// subclass of A with name B and override the dispmsg() function, also create one more
// subclass from B with name C and override the dispmsg() function in C also. In main
// invoke that function with the help of three class instances

class A {
    void dispmsg() {
        System.out.println("In class A");
    }
}

class B extends A {
    void dispmsg() {
        System.out.println("In class B");
    }
}

class C extends B {
    void dispmsg() {
        System.out.println("In class C");
    }
}

class Question03 {
    public static void main(String args[]) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.dispmsg();
        objB.dispmsg();
        objC.dispmsg();
    }
}