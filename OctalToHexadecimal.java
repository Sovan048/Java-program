import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octalStr = input.nextLine();
        input.close();
       
        int decimal = Integer.parseInt(octalStr, 8);
      
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("The equivalent hexadecimal value is: " + hexadecimal);
    }
}
