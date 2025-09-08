//Operators are used to perform computations or compare values.
//Arithmetic operators are used for mathematical calculations.
//Logical operators are used in decision -making or boolean expressions.

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        // Comparison Operators
        System.out.println("a > b?" + (a > b));
        System.out.println("a==b" + (a == b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("x AND y:" + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x : " + (!x));

    }
}