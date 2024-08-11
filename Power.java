import java.util.Scanner;
public class Power {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        double num = sc.nextDouble();
        System.out.println("Enter the power: ");
        double pow = sc.nextDouble();
        double result = Math.pow(num,pow);
        System.out.println("The result is = " +result);
    }
}
