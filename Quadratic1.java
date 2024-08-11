import java.util.*;
import java.lang.Math;
public class Quadratic1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double m1 = (-b + Math.sqrt(b*b - (4*a*c)))/(2*a);
        double m2 = (-b - Math.sqrt(b*b - (4*a*c)))/(2*a);
        System.out.println("first root"+m1);
        System.out.println("second root"+m2);
    }
}
