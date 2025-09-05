//Polymorphism = same method, many forms.

//Compile -time Polymorphism (Method Overloading)
class MathUtil {
    //same method name 'add', but different paratamer types
    int add(int a, int b) {
        return a+b ;
    }

    double add(double a, double b) {
        return a + b;
    }
}

//Runtime Polymorphism(Method Overriding)
 class Shape{
    void draw() {
        System.out.println("Drawing shape");
    }
}

    class Circle extends Shape {
        void draw() {
            System.out.println("Drawing circle");
        }
    }
    class Sqaure extends Shape {
        void draw() {
            System.out.println("Drawing Sqaure");
        }
    }
    
    //Main function
    public class Polymorphism {
        public static void main(String[] args) {

            //Compile time polymorphism
            MathUtil  m = new MathUtil();
            System.out.println("Addition of integers:" + m.add(5,10));                  //calls int add()
            System.out.println("Addition of doubles :" + m.add(2.5,3.7));               //calls double add()

            System.out.println(" ");

            //Runtime polymorphism
            Shape s;                                //reference of parent class

            s = new Circle();                       //object of Circle
            s.draw();                               //calls Circle's draw
            s= new Sqaure();                        //obj of sqaure
            s.draw();                               //calls Sqaure's draw()
            s= new Shape();                         //object of Shape
            s.draw();                               //calls shape's draw()
        }
    }
