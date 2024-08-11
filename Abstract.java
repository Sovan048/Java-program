
abstract class mobile { // Here Bike is an abstract class
    abstract void call(); // every bike has it's own engine

    abstract void gameplay(); // also, every bike has it's own wheels

    abstract void watch();

}

class test extends mobile { // Royal Enfield is bike company that uses the abstract concept of a bike
    void call() { // Every Royal Enfield bike has their own unique engine
        System.out.println("Royal Enfield's engine is very strong");
    }

    void gameplay() { // also their unique individual wheels
        System.out.println("Also it's wheels are safely");
    }

    void watch(){
        System.out.println("c");
    }
}

public class Abstract {
    public static void main(String[] args) {
       mobile m = new test();
       m.call();
       m.gameplay();
       m.watch(); 
    }
}