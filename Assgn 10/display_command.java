import java.io.*;

public class display_command {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java DisplayFileContents <filename>");
            System.exit(1);
        }

        String filename = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
