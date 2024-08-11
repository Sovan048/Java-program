import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
        int n,i,j,k;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
       i=0;
       j=1;
       System.out.println(i);
       System.out.println(j);
       k=i+j;
       for(int count=2;count<n;count++){
        k=i+j;
        System.out.println(k);
       i=j;
       j=k;
       k=i+j;
    }
}
}