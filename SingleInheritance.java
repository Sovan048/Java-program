public class SingleInheritance {
    public static void main(String[] args) {
        Derived ob = new Derived(); // created object of the derived class
        ob.display();// call the derived class method
        ob.show(); // call the base class method by using derived class object
    }
}

class Base { // declared the base class
    void show() {
        System.out.println("I am in Base class");
    }
}

class Derived extends Base { // declared derived class that extends the base class
    void display() {
        System.out.println("I am in derived class");
    }
}