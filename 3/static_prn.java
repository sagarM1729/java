// public class static_prn {
//     static String name = "Atharva Shende";
//     static int age = 21;
//     static int prn = 22210036;
//     static String address = "Ratnagiri";
//     static String studentClass = "SY IT";

//     public static void main(String[] args) {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("PRN: " + prn);
//         System.out.println("Address: " + address);
//         System.out.println("Class: " + studentClass);
//     }
// }



import java.util.Scanner;

public class static_prn {
    static String name;
    static int age;
    static int prn;
    static String address;
    static String studentClass;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter student details
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter PRN: ");
        prn = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        
        System.out.print("Enter class: ");
        studentClass = scanner.nextLine();

        // Print student details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PRN: " + prn);
        System.out.println("Address: " + address);
        System.out.println("Class: " + studentClass);

        scanner.close();
    }
}
