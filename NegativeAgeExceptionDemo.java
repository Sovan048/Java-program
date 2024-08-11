import java.util.Scanner;

public class NegativeAgeExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        try {
            System.out.print("Enter the age of the person: ");
            age = scanner.nextInt();

            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative");
            }

            System.out.println("Age entered: " + age);
        } catch (NegativeAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
    }
}

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}
