import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        int n,r,s=0,m;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        m=n;
        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s == m){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
