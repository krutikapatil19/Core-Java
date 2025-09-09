public class ConditionalStatement {
    public static void main(String[] args) {
        int fruitCount = 11;

        if(fruitCount > 10 ) {
            System.out.println("Wow! You have a lot of fruits!");
        } else if (fruitCount >= 5) {
            System.out.println("You have a decent number of fruits.");
        } else {
            System.out.println("Not enough fruits, go buy more!");
        }
    }
}

//if statement - executes a block if the condition is true.
//else if - checks multiple conditions sequentially .
//else - executes a block when none of the above conditions are true.