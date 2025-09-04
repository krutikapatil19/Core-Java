import java.io.*;                                            //Import File class

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");       //create object of file class , give file name

            //createNewFile() -> creates file if not exists
            if(file.createNewFile()) {
                System.out.println ("File created: " + file.getName());
            } else {
                System.out.println ("File already exists.");
            }
        }  
        catch (Exception e) {
            System.out.println("An error occured.");
            e.printStackTrace();                            //prints details of error                            
        }
    }

}