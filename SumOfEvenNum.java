import java.util.Scanner;
public class SumOfEvenNum {
    public static void main(String[] args){
        System.out.println("Enter the value of upper and lower bound");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of all even number between " +m+ " to " +n+ " is = "+sum);
    }
}
