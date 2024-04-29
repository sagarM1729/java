

// public class StringBuffers {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Hello World!");
//         System.out.println("Buffer = " + sb);
//         System.out.println("Length = " + sb.length());
//         System.out.println("Capacity = " + sb.capacity());
    
//         sb.setCharAt(1, 'E'); // changes the StringBuffer to "HEllo, World!"
//         System.out.println(sb);
//         sb.append(", World!"); // changes the StringBuffer to "Hello, World!, World"
//         System.out.println(sb);
//         sb.insert(6, "there, "); // changes the StringBuffer to "Hello, there, World!"
//         System.out.println(sb);
//         sb.delete(6, 13); // changes the StringBuffer to "Hello,!"
//         System.out.println(sb);
//         sb.reverse(); // changes the StringBuffer to "!dlroW ,olleH"
//         System.out.println(sb);
//         String str = sb.toString(); // returns "Hello, World!"
//         System.out.println(str);
//     }
// }



import java.util.Scanner;

public class StringBuffers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        StringBuffer sb = new StringBuffer(userInput);
        System.out.println("Buffer = " + sb);
        System.out.println("Length = " + sb.length());
        System.out.println("Capacity = " + sb.capacity());

        sb.setCharAt(1, 'E'); // changes the StringBuffer to "HEllo, World!"
        System.out.println(sb);
        sb.append(", World!"); // changes the StringBuffer to "Hello, World!, World"
        System.out.println(sb);
        sb.insert(6, "there, "); // changes the StringBuffer to "Hello, there, World!"
        System.out.println(sb);
        sb.delete(6, 13); // changes the StringBuffer to "Hello,!"
        System.out.println(sb);
        sb.reverse(); // changes the StringBuffer to "!dlroW ,olleH"
        System.out.println(sb);
        String str = sb.toString(); // returns "Hello, World!"
        System.out.println(str);

        scanner.close();
    }
}

