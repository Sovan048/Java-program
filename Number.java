import java.util.*;
public class Number {
    public static void main(String args[]){
        System.out.println("Enter the number:");
        int n;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        if(n>0){
            System.out.println("The is positive");
        }else if(n<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}
