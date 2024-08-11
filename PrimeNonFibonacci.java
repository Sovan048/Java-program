public class PrimeNonFibonacci {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("First 100 Prime, non-Fibonacci numbers are: ");
        while (count < 100) {
            if (isPrime(number) && !isFibonacci(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

  
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFibonacci(int number) {
        int a = 0, b = 1;
        while (b < number) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == number;
    }
    
}
