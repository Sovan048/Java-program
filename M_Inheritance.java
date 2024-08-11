class A{
    int a =10;
    void display()
    {
        System.out.println("Parent class");
    }
}
class B extends A{
    int b = 20;
    void show()
    {
        System.out.println("1st derived class");
    }
}
class C extends B{
    int c = 40;
    void dis()
    {
        System.out.println("Final derived class");
    }
}
public class M_Inheritance {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println("Parent class variable " +obj.a);
        obj.display();
        System.out.println("1st derived class variable " +obj.b);
        obj.show();
        System.out.println(obj.c);
        obj.dis();
    }
}
