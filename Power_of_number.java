import java.util.Scanner;
public class Power_of_number {
    public static void main(String[] args) {
        int base,power,temp;
        System.out.println("Enter the base and power: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        power = sc.nextInt();
        temp = base;
        for(int i=1;i<power;i++){
            base = base * temp;
        }
        System.out.println("the power of the number is :"+base);
        sc.close();
    }
}
