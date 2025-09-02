public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;                                      //risky code , which can generate exception (divide by 0)
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");           //handled exception
        }
    }
}


/*Exception = error at runtime (r.g. dividing by zero, file not found).
Handling = writing code so program doesn't crash , but shows a meaningful message about the error.

try -> put the risky code here.
catch -> handle the error
finally -> always runs (close files, DB connections)
throw -> throw an exception manually
throws -> declare that a method may throw an exception.
*/


//In the above program , we have placed the code that might generate an exception inside the try block . Every try block is followed by a catch block . When an exception occurs , it is caught by the catch block. 