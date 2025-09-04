public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            
            //risky code
            int result = a / b;                         //This will cause ArithmeticException

            int[] arr = new int[5];
            arr[10] = 20;                               //This will cause ArrayIndexOutOfBoundsException


        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error. Cannot divide by zero!");         //1st catch block -> handles division errors.
        } 
        catch (ArrayIndexOutOfBoundsException e) {                                    //handles wrong array index
            System.out.println("Array index out of range!");
        } 
        catch (Exception e) {                                                         //handles any other errors
            System.out.println("Some other error: " + e);
        }
        System.out.println("Program continues...");
    }
}



/*In java , one try block can have many catch blocks. 
-> A single risky code can throw different types of exceptions.
-> With multiple catch blocks , we can handle each error differently.
*/