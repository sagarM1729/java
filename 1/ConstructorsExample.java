// public class Point {
//     private int x;
//     private int y;

//     // Default constructor
//     public Point() {
//         this.x = 0;
//         this.y = 0;
//     }

//     // Parameterized constructor
//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     // Copy constructor
//     public Point(Point other) {
//         this.x = other.x;
//         this.y = other.y;
//     }

//     public int getX() {
//         return this.x;
//     }

//     public int getY() {
//         return this.y;
//     }

//     public static void main(String[] args) {
//         // Default constructor
//         Point point1 = new Point();
//         System.out.println("x: " + point1.getX() + ", y: " +
//                 point1.getY());
//         // Parameterized constructor
//         Point point2 = new Point(15, 40);
//         System.out.println("x: " + point2.getX() + ", y: " +
//                 point2.getY());
//         // Copy constructor
//         Point point3 = new Point(point2);
//         System.out.println("x: " + point3.getX() + ", y: " +
//                 point3.getY());
//     }
// }





import java.util.Scanner;

public class ConstructorsExample {
    private int value;

    // Default constructor
    public ConstructorsExample() {
        this.value = 3;
    }

    // Parameterized constructor
    public ConstructorsExample(int value) {
        this.value = value;
    }

    // Copy constructor
    public ConstructorsExample(ConstructorsExample other) {
        this.value = other.value;
    }

    // Method to get the value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        ConstructorsExample obj1 = new ConstructorsExample();
        System.out.println("Value of obj1: " + obj1.getValue()); // Output: 0

        // Using parameterized constructor
        System.out.print("Enter a value for obj2: ");
        int inputValue = scanner.nextInt();
        ConstructorsExample obj2 = new ConstructorsExample(inputValue);
        System.out.println("Value of obj2: " + obj2.getValue()); // Output: user input

        // Using copy constructor
        ConstructorsExample obj3 = new ConstructorsExample(obj2);
        System.out.println("Value of obj3: " + obj3.getValue()); // Output: same as obj2

        scanner.close();
    }
}
