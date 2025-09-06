class Student {
    String name;
    int age;

    void showDetails() {
        System.out.println("Name: " + name + " , Age : " + age);
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        //Creating first object
        Student s1 = new Student();
        s1.name = "Eliza";
        s1.age = 20;

        //Creating second object
        Student s2 = new Student();
        s2.name = "John";
        s2.age = 21;

        //Calling methods
        s1.showDetails();
        s2.showDetails(); 
    }
}