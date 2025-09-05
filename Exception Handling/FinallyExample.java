//In java, finally block is always executed no matter whether there is an exception or not.
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error handled");
        } finally {
            System.out.println("This is the finally block .This will always run");
        }
    }
}


/*If an exception occurs, the finally block is executed after the try..catch block. 
Otherwise, it is executed after the try block .
For each try block, there can be only one finally block.
*/