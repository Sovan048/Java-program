class MethodOverride {
    public static void main(String[] args) {
        Derived ob = new Derived();// created object of the derived class
        ob.show();// call the show method using derived class object
        // the base class show() method is being overriden by derived class show method
        // so the derived class show() will be displayed
    }
}

class Base {
    void show() { // declared the base class
        System.out.println("I am in base class");
    }
}

class Derived extends Base { // declared derived class that extends the base class
    void show() {
        System.out.println("I am in derived class");
    }
}