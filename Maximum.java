import java.util.*;
public class Maximum {
    public static void main(String[] args){
        System.out.println("Enter the three numbers");
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Maximumt number is:"+a);
        }
        else if(b > c)
        {
            System.out.println("Maximum number is:"+b);
        }
        else
        {
            System.out.println("Maximum number is:"+c);
        }
    }
}
