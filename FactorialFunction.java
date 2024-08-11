import java.util.Scanner;
public class FactorialFunction {
    public static void PrintFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("The factorial is " +fact);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter the number ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        PrintFactorial(n);
    }
}
