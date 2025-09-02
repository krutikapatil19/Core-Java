public class ThrowExample {
    public static void main(String[] args) {
        int age = 16;

        if (age < 18) {

            //Manually throws exception
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }
}



/*Throw is used to create and send(throw) an exception in Java
It is used when you want to manaually show an error in your code.

Syntax : throw new ExceptionType("Message");

Its used when you want to check a condition  and create your own error. 
Ex: If age < 18 , throw exception -> "not eligible to vote"

When throw runs -> program stops at that line and shows the error.Its used when you want to stop execution if some rule is broken .

*/