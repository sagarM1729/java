// public class NestedTryBlockExample {
//     public static void main(String[] args) {
//         try {
//             int[] arr = { 1, 2, 3 };
//             int a = 10;
//             int b = 0;
//             try {
//                 int c = a / b;
//             } catch (ArithmeticException e) {
//                 System.out.println("Divide by zero exception: " + e.getMessage());
//             }
//             System.out.println("The value at index 5 is " + arr[5]);
//             // This will throw an ArrayIndexOutOfBoundsException
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index out of bound exception: "
//                     + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         } finally {
//             System.out.println("This code will always be executed.");
//         }
//     }
// }
