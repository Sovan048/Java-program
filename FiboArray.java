import java.util.Scanner;
public class FiboArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entethe number");
        n = sc.nextInt();
        int a[]=new int[n];
        a[0]=0;
        a[1]=1;
        System.out.println("The fibo numbers are: ");
        System.out.println(a[0]);
        System.out.println(a[1]);
        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
            System.out.println(a[i]);
        }
        sc.close();
    }
}
