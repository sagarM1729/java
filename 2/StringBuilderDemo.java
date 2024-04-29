// public class StringBuilderDemo {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");
//         sb.append(" World");
//         sb.reverse();
//         System.out.println(sb);
//         sb.insert(6, "there,");
//         System.out.println(sb);
//         sb.delete(6, 11);
//         System.out.println(sb);
//         sb.replace(0, 5, "Hi");
//         System.out.println(sb);
//         String str = sb.toString();
//         System.out.println(str);
//         StringBuilder sb2 = new StringBuilder(10);
//         sb2.append("Java");
//         System.out.println("Length of sb2: " + sb2.length());
//         System.out.println("Capacity of sb2:" + sb2.capacity());
//     }
// }






import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        StringBuilder sb = new StringBuilder(userInput);
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);
        sb.insert(6, "there,");
        System.out.println(sb);
        sb.delete(6, 11);
        System.out.println(sb);
        sb.replace(0, 5, "Hi");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("Java");
        System.out.println("Length of sb2: " + sb2.length());
        System.out.println("Capacity of sb2:" + sb2.capacity());

        scanner.close();
    }
}
