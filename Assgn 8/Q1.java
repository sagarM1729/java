import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        List<Student> students = new ArrayList<>();

        // Menu loop
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. ArrayList Example");
            System.out.println("3. LinkedList Example");
            System.out.println("4. ArrayDeque Example");
            System.out.println("5. PriorityQueue Example");
            System.out.println("6. HashSet Example");
            System.out.println("7. TreeSet Example");
            System.out.println("8. HashMap Example");
            System.out.println("9. LinkedHashMap Example");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    arrayListExample(students);
                    break;
                case 3:
                    linkedListExample(students);
                    break;
                case 4:
                    arrayDequeExample(students);
                    break;
                case 5:
                    priorityQueueExample(students);
                    break;
                case 6:
                    hashSetExample(students);
                    break;
                case 7:
                    treeSetExample(students);
                    break;
                case 8:
                    hashMapExample(students);
                    break;
                case 9:
                    linkedHashMapExample(students);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 10.");
            }
        } while (choice != 10);

        scanner.close();
    }

    public static void addStudent(Scanner scanner, List<Student> students) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter student gender (M/F): ");
        char gender = scanner.nextLine().charAt(0);

        Student student = new Student(rollNumber, name, gender);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    public static void arrayListExample(List<Student> students) {
        System.out.println("ArrayList Example:");
        System.out.println(students);
    }

    public static void linkedListExample(List<Student> students) {
        System.out.println("LinkedList Example:");
        LinkedList<Student> linkedList = new LinkedList<>(students);
        StringBuilder output = new StringBuilder();
        for (Student student : linkedList) {
            output.append(student).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }

    public static void arrayDequeExample(List<Student> students) {
        System.out.println("ArrayDeque Example:");
        ArrayDeque<Student> arrayDeque = new ArrayDeque<>(students);
        StringBuilder output = new StringBuilder();
        for (Student student : arrayDeque) {
            output.append(student).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }

    public static void priorityQueueExample(List<Student> students) {
        System.out.println("PriorityQueue Example:");
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(students);
        StringBuilder output = new StringBuilder();
        for (Student student : priorityQueue) {
            output.append(student).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }

    public static void hashSetExample(List<Student> students) {
        System.out.println("HashSet Example:");
        HashSet<Student> hashSet = new HashSet<>(students);
        StringBuilder output = new StringBuilder();
        for (Student student : hashSet) {
            output.append(student).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }

    public static void treeSetExample(List<Student> students) {
        System.out.println("TreeSet Example:");
        TreeSet<Student> treeSet = new TreeSet<>(students);
        StringBuilder output = new StringBuilder();
        for (Student student : treeSet) {
            output.append(student).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }

    public static void hashMapExample(List<Student> students) {
        System.out.println("HashMap Example:");
        HashMap<Integer, Student> hashMap = new HashMap<>();
        for (Student student : students) {
            hashMap.put(student.getRollNumber(), student);
        }
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            output.append(entry.getKey()).append(" : ").append(entry.getValue()).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }

    public static void linkedHashMapExample(List<Student> students) {
        System.out.println("LinkedHashMap Example:");
        LinkedHashMap<Integer, Student> linkedHashMap = new LinkedHashMap<>();
        for (Student student : students) {
            linkedHashMap.put(student.getRollNumber(), student);
        }
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Integer, Student> entry : linkedHashMap.entrySet()) {
            output.append(entry.getKey()).append(" : ").append(entry.getValue()).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }
}

class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;
    private char gender;

    public Student(int rollNumber, String name, char gender) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNumber, o.rollNumber);
    }
}
