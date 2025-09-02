public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error handled");
        } finally {
            System.out.println("This will always run");
        }
    }
}