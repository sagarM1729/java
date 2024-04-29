import java.io.*;

public class display_text {
    public static void main(String[] args) {
        String filename = "example.txt";
        File file = new File(filename);

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.err.println("File " + filename + " does not exist.");
        }
    }
}
