// public class ExceptionHandlingExample {
//     public static void main(String[] args) {
//         try {
//             // Divide by Zero
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//         } catch (ArithmeticException e) {
//             System.out.println("Divide by zero exception: " + e.getMessage());
//         }
//         try {
//             // Array Index Out Of Bound
//             int[] arr = new int[5];
//             arr[10] = 11;
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index out of bound exception: "
//                     + e.getMessage());
//         }
//         try {
//             // Number Format
//             String s = "abc";
//             int i = Integer.parseInt(s);
//         } catch (NumberFormatException e) {
//             System.out.println("Number format exception: " + e.getMessage());
//         }
//         try {
//             // Null Pointer
//             String str = null;
//             int length = str.length();
//         } catch (NullPointerException e) {
//             System.out.println("Null pointer exception: " +e.getMessage());
//         }
//     }
// }