import java.io.*;

public class delete {
    public static void main(String[] args) {
        String filename = "example.txt";
        File file = new File(filename);

        if (file.delete()) {
            System.out.println("File " + filename + " deleted successfully.");
        } else {
            System.err.println("Failed to delete the file " + filename);
        }
    }
}
