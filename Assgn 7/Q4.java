public class Q4 extends Thread {
    @Override 
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running");
        }
    }
    public static void main(String[] args) {
        Q4 thread = new Q4();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread is running");
        }
    }
}
// Using the Runnable Interface 
// public class Q4 implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Thread is running");
//         }
//     }
//     public static void main(String[] args) {
//         Q4 runnable = new Q4();
//         Thread
//         thread = new Thread(runnable);
//         thread.start();
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Main Thread is running");
//         }
//     }
// }