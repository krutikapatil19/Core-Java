class Animal{                                               //Parent class (super class)
    void sound() {                                          //It has a method -> sound()
        System.out.println("Animal makes a sound");       //general behavior
    }
}

class Dog extends Animal {                                 //Dog inherits Animal . Dog is the subclass or child class.
    void sound() {
        System.out.println("Dog barks");                 //It overrides the sound()method , and gives its own version: "Dog barks."
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Dog d = new Dog();                                 //Createing Dog object
        d.sound();                                         //calling Dog's sound() 
    }
}


//overriding -> Method overriding means a child class redefining a method of the parent. 
//When we create a dog object , and call sound(), the JVM checks: Is there a sound() method inside dog? Yes -> It runs that. So the output becomes Dog barks.