public class PrimeNonFibo {
    public static void main(String[] args) {
        int count = 0 ;
        int number = 2 ;
        System.out.println("100 non fibo prime numbers are");
        while(count<100){
            if(isPrime(number)&&! isFibo(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int number){ 
        if(number<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isFibo(int number){
        int a=0;
        int b=1;
        while(b<number){
            int temp = a+b;
            a=b;
            b=temp;
        }
        return b == number;
    }
}
