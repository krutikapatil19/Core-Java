//Abstraction = hiding implementation (hiding the details and only showing the essentials)


//Abstract class (needs subclasses to complete)
abstract class Vehicle {
    abstract void drive ();                                 //no body (only declaration)
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");            //the vehicle is just a blueprint , and the car is real object .
    }
}


//Interface = a contract/rulebook . (every class must follow)

interface Payment {
    void pay();
}
class UPI implements Payment {
    public void pay() {
        System.out.println("Payment done via UPI");
    }
}

//Main class
public class Abstraction {
    public static void main(String[] args) {

        //Using abstract class and its implementation
        Vehicle v = new Car();                              //Vehicle reference , Car object
        v.drive();                                          //"Car is driving"

        //Using interface and its implementation
        Payment p = new UPI();                              //Payment reference, UPI object 
        p.pay();                                            //"Payment done via UPI"
    }
}