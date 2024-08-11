import java.util.Scanner;

public class StringPalindrome {
        public static void main(String args[]){
            @SuppressWarnings("resource")
            Scanner sc = new Scanner (System.in);
            String str,rev;
            System.out.println("Enter a string: ");
            str = sc.nextLine();
            rev = "";
            int length = str.length();
            for(int i = length-1; i>=0;i--){
                rev = rev+str.charAt(i);
            }
            if(str.equals(rev)){
                System.out.println(str+ " is a palindrome");
            }
            else
            {
                System.out.println(str+ " is not palindrome");
            }
        }    
}
