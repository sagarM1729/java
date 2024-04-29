import java.io.*;

public class append {
    public static void main(String[] args) {
        String filename = "example.txt";
        String textToAppend = "This text will be appended to the file.";

        try (FileWriter fw = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            out.println(textToAppend);
            System.out.println("Text appended to " + filename + " successfully.");

        } catch (IOException e) {
            System.err.println("Error appending text to file: " + e.getMessage());
        }
    }
}
