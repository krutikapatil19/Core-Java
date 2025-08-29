class Student {
        private String name ;               //private = data hiding

        public String getName(){            //getter -> to read data 
            return name;
        }
        public void setName(String name){   //set name
            this.name = name;
        }
    }
public class Encapsulation{
    public static void main(String[] args){
        Student s = new Student();              //creating a student object
        s.setName("Krutika");              //setter -> to modify data safely
        System.out.println(s.getName());        //accessing name using getter


    }
}



