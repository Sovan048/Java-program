import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        int j;
        System.out.println("Enter the number n and m");
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<m;i++){
            for(j=2;j<i;j++){
                if(i % j == 0){
                    break;
                }
            }
            if(i==j){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
