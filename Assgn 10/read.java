import java.io.*;

public class read {
    public static void main(String[] args) {
        String filename = "example.txt";
        int startIndex = 5;

        try (FileInputStream fis = new FileInputStream(filename)) {
            fis.skip(startIndex);
            int bytesRead;
            while ((bytesRead = fis.read()) != -1) {
                System.out.print((char) bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
