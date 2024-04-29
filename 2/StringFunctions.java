
// public class StringFunctions {
//     public static void main(String[] args) {
//         String str1 = "hello World!";
//         String str2 = "hello world";
//         String str3 = "Java is awesome";
//         // charAt(int index)
//         char ch = str1.charAt(4);
//         System.out.println("Character at index 4 of str1: " + ch);
//         // concat(String str)
//         String str4 = str1.concat(" How are you?");
//         System.out.println("Concatenated string: " + str4);
//         // contains(CharSequence sequence)
//         boolean result = str3.contains("is");
//         System.out.println("Does str3 contain 'is'? " + result);
//         // endsWith(String suffix)
//         result = str1.endsWith("!");
//         System.out.println("Does str1 end with '!'? " + result);
//         // equals (Object obj)
//         result = str1.equals(str2);
//         System.out.println("Are str1 and str2 equal? " + result);
//         // equalsIgnoreCase (String str)
//         result = str1.equalsIgnoreCase(str2);
//         System.out.println("Are str1 and str2 equal (ignoring case)? " + result);
//         // indexOf (int ch)
//         int index = str1.indexOf('o');
//         System.out.println("Index of 'o' instr1: " + index);
//         // isEmpty ()
//         result = str1.isEmpty();
//         System.out.println("Is str1 empty? " + result);
//         // length ()
//         int length = str3.length();
//         System.out.println("Length of str3: " + length);
//         // replace (char oldChar, char newChar)
//         String str5 = str1.replace('o', 'e');
//         System.out.println("Replaced 'o' with'e: " + str5);
//     }
// }




import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three strings
        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter string 3: ");
        String str3 = scanner.nextLine();

        // charAt(int index)
        char ch = str1.charAt(4);
        System.out.println("Character at index 4 of str1: " + ch);
        // concat(String str)
        String str4 = str1.concat(" How are you?");
        System.out.println("Concatenated string: " + str4);
        // contains(CharSequence sequence)
        boolean result = str3.contains("is");
        System.out.println("Does str3 contain 'is'? " + result);
        // endsWith(String suffix)
        result = str1.endsWith("!");
        System.out.println("Does str1 end with '!'? " + result);
        // equals (Object obj)
        result = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + result);
        // equalsIgnoreCase (String str)
        result = str1.equalsIgnoreCase(str2);
        System.out.println("Are str1 and str2 equal (ignoring case)? " + result);
        // indexOf (int ch)
        int index = str1.indexOf('o');
        System.out.println("Index of 'o' in str1: " + index);
        // isEmpty ()
        result = str1.isEmpty();
        System.out.println("Is str1 empty? " + result);
        // length ()
        int length = str3.length();
        System.out.println("Length of str3: " + length);
        // replace (char oldChar, char newChar)
        String str5 = str1.replace('o', 'e');
        System.out.println("Replaced 'o' with 'e': " + str5);

        scanner.close();
    }
}
