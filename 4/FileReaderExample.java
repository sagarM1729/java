import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            System.out.println(chars);
        } finally {
            if (fr != null) {
                fr.close();
            }
        }
    }
}
