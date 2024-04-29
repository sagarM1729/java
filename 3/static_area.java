import java.util.Scanner;

public class static_area {
    static double radius;
    static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = scanner.nextDouble();
        double area = calculateArea();
        double volume = calculateVolume();
        System.out.println("Area of the sphere: " + area);
        System.out.println("Volume of the sphere: " + volume);
        scanner.close();
    }

    public static double calculateArea() {
        double area = 4 * PI * radius * radius;
        return area;
    }

    public static double calculateVolume() {
        double volume = (4.0 / 3.0) * PI * radius * radius * radius;
        return volume;
    }
}