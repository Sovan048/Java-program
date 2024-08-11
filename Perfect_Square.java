import java.util.*;
public class Perfect_Square {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        double b = Math.sqrt(n);
        int c = (int)b;
       // System.out.println(c);
        if(c*c==n){
            System.out.println("perfect square");
        }
        else
        {
            System.out.println("Not");
        }
        sc.close();
    }
}
