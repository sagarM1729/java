import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingSeconds2 = remainingSeconds % 60;
        System.out.printf("%d seconds = %d hour(s), %d minute(s), and %d second(s)",
                seconds, hours, minutes, remainingSeconds2);
        scanner.close();
    }
}
