import java.io.*;

public class write {
    public static void main(String[] args) {
        byte[] bytesToWrite = {65, 66, 67, 68, 69}; // ASCII values for A, B, C, D, E
        String fileName = "output.txt";
        
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(bytesToWrite);
            System.out.println("Bytes have been written to " + fileName + " successfully.");
        } catch (IOException e) {
            System.err.println("Error writing bytes to file: " + e.getMessage());
        }
    }
}