import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = input.nextLine();
        System.out.println(Upper_tolower_and_lower_toUpper(line));
        input.close();

    }

    static String Upper_tolower_and_lower_toUpper(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        return new String(arr);
    }
}