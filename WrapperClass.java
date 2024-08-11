public class WrapperClass 
{
    // This java code adds two integers using command line argument
    
    public static void main(String[] args) {
        // here parseInt() is a method of the Integer Wrapper class
        int a = Integer.parseInt(args[0]);        
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum of the integers entered in the command line: " + (a+b));
    }
}