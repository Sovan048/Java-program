import java.util.*;
public class Reverse {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        int n,r,s=0;
        System.out.println("Enetr the number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("The reverse number is = " +s);
    }
}
