public class ConstructorOverload 
{
    public static void main(String[] args) {
        new Overloaing(10, 12);
        new Overloaing(10, 12.0f);
        new Overloaing(10, 12.00);
    }
}

class Overloaing
{
    public Overloaing(int a, int b) {
        System.out.println("Here both parameters are integer");
    }

    public Overloaing(int a, float b) {
        System.out.println("Here one parameter is integer and another is float");
    }

    public Overloaing(int a, double b) {
        System.out.println("Here one parameter is integer and another is double");
    }
}
