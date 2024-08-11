public class Pattern_Q24 {
    public static void main(String[] args) {
        int n = 4; // the number of rows can also be inputted
        int num = 1;
       
        for (int i = 1; i <= n; i++) {           
            for (int j = 1; j <= i; j++) {                
                System.out.print(num + " ");
                num += 2;
            }        
            System.out.println();
        }
    }
}