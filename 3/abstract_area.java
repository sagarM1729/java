import java.util.Scanner;

abstract class Shape {
    abstract void RectangleArea(double length, double breadth);

    abstract void SquareArea(double side);

    abstract void CircleArea(double radius);
}

class Area extends Shape {
    @Override
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is " + area);
    }

    @Override
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of square with side " + side + " is " + area);
    }

    @Override
    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is " + area);
    }
}

public class abstract_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter dimensions
        System.out.print("Enter length and breadth of rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        Area obj = new Area();
        obj.RectangleArea(length, breadth);
        obj.SquareArea(side);
        obj.CircleArea(radius);

        scanner.close();
    }
}
