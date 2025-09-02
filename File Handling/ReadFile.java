import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;                                   //To read file content

public class ReadFile {
    public static void main(String[] args) {
        try {
            File f = new File("myfile.txt");

            //Scanner reads line by line
            Scanner reader = new Scanner(f);                //opens file to read.

            while (reader.hasNextLine()) {                  //checks if another line exists.
                String data = reader.nextLine();            //nextLine() -> reads one line at a time
                System.out.println(data);
            }
            reader.close();                                 //close scanner/file
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
