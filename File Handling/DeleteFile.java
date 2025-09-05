import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("myfile.txt");

        if(f.delete()) {                                                    //f.delete -> deletes the file.
            System.out.println("Deleted the file: " + f.getName());         //returns true if success, false if failed.
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}