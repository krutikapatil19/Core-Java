class Car {                                         //creating a class named Car (Car = blueprint/design)
    
    //Varibales inside class (called roperties/attributes)
    String brand;
    int year;

    //Method inside class (action/behavior of the car class)
    void displayInfo() {
        System.out.println("Brand: " + brand + " , Year : " + year);
    }
}

//Main class
public class ClassExample {
    public static void main(String[] args) {
        //Creating an object of class Car(real things from blueprint)
        Car myCar = new Car();

        //Assigning values to the object(initialize its properties)
        myCar.brand = "Tesla" ;
        myCar.year = 2024;

        // Calling method
        myCar.displayInfo();
    }
    
}

//A class is like a blueprint (it defines properties and actions)
