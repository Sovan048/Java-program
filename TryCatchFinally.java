import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, result;
        try {
            System.out.print("Enter first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            num2 = sc.nextInt();
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Rest of the program executed successfully.");
            sc.close();
        }
    }
}