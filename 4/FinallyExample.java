// public class FinallyExample {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//             System.out.println("This code will not be executed.");
//         } catch (ArithmeticException e) {
//             System.out.println("Divide by zero exception: " +
//                     e.getMessage());
//         } finally {
//             System.out.println("This code will always be executed.");
//         }
//     }
// }