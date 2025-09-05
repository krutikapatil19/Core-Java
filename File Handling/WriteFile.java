import java.io.FileWriter;          //used to write 
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {

            //FileWriter opens file in write mode
            FileWriter writer = new FileWriter("myfile.txt");

            //Write data to file
            writer.write("Hello Friend! \nWelcome to File Handling in Java.");

            //Always close writer after work
            writer.close();

            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}



//FileWriter -> writes text into file.
//write() -> puts content inside file.
//close() -> saves data and closes file.