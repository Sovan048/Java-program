import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        int n;
        int f=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                f=1;
                break;
            }
            else
            break;
        }
        if(f==1)
        System.out.println("not prime");
        else
        System.out.println("prime");
    }
}
