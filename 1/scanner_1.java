import java.util.Scanner;

public class scanner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading a String
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);
        // Reading an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        // Reading a double
        System.out.print("Enter a double: ");
        double dbl = scanner.nextDouble();
        System.out.println("You entered: " + dbl);
        // Reading a boolean
        System.out.print("Enter a boolean (true or false): ");
        boolean bool = scanner.nextBoolean();
        System.out.println("You entered: " + bool);
        scanner.close();
    }
}
