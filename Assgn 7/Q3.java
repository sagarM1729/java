public class Q3 {
 public static void main(String[] args) {
    Thread currentThread = Thread.currentThread();
    System.out.println("Current thread: " + currentThread.getName());
    System.out.println("ID: " + currentThread.getId());
    System.out.println("Priority: " + currentThread.getPriority());
    System.out.println("State: " + currentThread.getState());
    System.out.println("Is daemon: " + currentThread.isDaemon());
    System.out.println("Is alive: " + currentThread.isAlive());
    System.out.println("Thread group: " + currentThread.getThreadGroup().getName());
 }
} 