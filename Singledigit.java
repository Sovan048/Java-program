import java.util.Scanner;
public class Singledigit {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int digit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(n!=0){
            int rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(sum>9){
            while(sum!=0){
                int rem = sum % 10;
                digit =digit + rem;
                sum =sum/10;
            }
            System.out.println("Single digits are "+digit);
        }
        else
        {
            System.out.println("Single digits are "+sum);
        }
        sc.close();
    }
}
