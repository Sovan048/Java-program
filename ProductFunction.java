import java.util.Scanner;
public class ProductFunction {
    public static int CalculateProd(int a,int b){
        int prod = a * b ;
        return prod;
    }
    public static void main(String args[]){
        System.out.println("Enter two number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = CalculateProd(a, b);
        System.out.println("The prod of two number is " +prod);
    }
}
