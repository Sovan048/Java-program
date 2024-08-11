class A implements Runnable{
    public void run()
    {
        System.out.println("Create thread");
    }
}
class B implements Runnable{
    public void run(){
        System.out.println("2nd Thread");
    }
}
public class Driver {
    public static void main(String args[]){
        A a1 = new A();
        B b1 = new B();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);
        t1.start();
        t2.start();
    }
}
