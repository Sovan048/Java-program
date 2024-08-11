import java.util.*;
public class Functions{
    public static int CalculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        System.out.println("Enter two numbers ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("Sum of two number is " +sum);
    }
}