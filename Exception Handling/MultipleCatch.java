public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 20;                       //risky code (out of bounds)
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range!");
        } catch (Exception e) {
            System.out.println("Some other error");
        }
    }
}
