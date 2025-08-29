//Abstraction = hiding implementation


//Abstract class
abstract class Vehicle {
    abstract void drive ();             //no body (only declaration)
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}


//Interface

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
        Vehicle v = new Car();  
        v.drive();

        //Using interface and its implementation
        Payment p = new UPI();
        p.pay();
    }
}