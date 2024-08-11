import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        int d = n;
        int sum =0;
        while(n!=0){
          // int rem = n%10;
            count++;
            n=n/10;
        }
       // double sum=0;
        while(temp!=0){
            int rem = temp%10;        
        sum = (int) (sum + Math.pow( rem, count));
            temp=temp/10;
        }
        if(d==sum){
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not armstrong");
        }
    }
}
