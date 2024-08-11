import java.util.*;
public class Factorial {
    public static void main(String args[]){
        int n,i,fact;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial number = " +fact);
    }
}
