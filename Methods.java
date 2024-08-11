public class Methods implements Runnable{
    public void run()
    {
        System.out.println("Thread is runnning");
    }
    public static void main(String[] args) {
        Methods m = new Methods();
        Thread T = new Thread(m);
        T.start();
    }
}
