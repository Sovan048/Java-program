public class Static_Demo {
    static int a = 4;
    static int b;
    static void display(int x){
        System.out.println("x="+x);
        System.out.println("b="+b);
        System.out.println("a="+a);
    }
    static{
        System.out.println("Static block initilize");
        b = a*4;
    }
    public static void main(String[] args) {
        display(40);
    }
}
