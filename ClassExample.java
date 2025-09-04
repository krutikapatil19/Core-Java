class Car {
    //Properties/variables of the class
    String brand;
    int year;

    //Method (action/behavior of the class)
    void displayInfo() {
        System.out.println("Brand: " + brand + " , Year : " + year);
    }
}

public class ClassExample {
    public static void main(String[] args) {
        //Creating an object of class Car
        Car myCar = new Car();

        //Assigning values to the object
        myCar.brand = "Tesla" ;
        myCar.year = 2024;

        // Calling method
        myCar.displayInfo();
    }
    
}

//A class is like a blueprint (it defines properties and actions)
