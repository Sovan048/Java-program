class Animals{
    String color = "white";
}
class Dog extends Animals{
    String color = "black";
    void printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printcolor();
    }
}
