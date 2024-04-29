import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        List<Book> books = new ArrayList<>();

        // Menu loop
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add Book");
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
                    addBook(scanner, books);
                    break;
                case 2:
                    arrayListExample(books);
                    break;
                case 3:
                    linkedListExample(books);
                    break;
                case 4:
                    arrayDequeExample(books);
                    break;
                case 5:
                    priorityQueueExample(books);
                    break;
                case 6:
                    hashSetExample(books);
                    break;
                case 7:
                    treeSetExample(books);
                    break;
                case 8:
                    hashMapExample(books);
                    break;
                case 9:
                    linkedHashMapExample(books);
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

    public static void addBook(Scanner scanner, List<Book> books) {
        System.out.print("Enter book name: ");
        String name = scanner.nextLine();

        System.out.print("Enter book ISBN: ");
        long isbn = scanner.nextLong();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        Book book = new Book(isbn, name, price);
        books.add(book);

        System.out.println("Book added successfully!");
    }

    public static void arrayListExample(List<Book> books) {
        System.out.println("ArrayList Example:");
        System.out.println(formatOutput(books));
    }

    public static void linkedListExample(List<Book> books) {
        System.out.println("LinkedList Example:");
        LinkedList<Book> linkedList = new LinkedList<>(books);
        System.out.println(formatOutput(linkedList));
    }

    public static void arrayDequeExample(List<Book> books) {
        System.out.println("ArrayDeque Example:");
        ArrayDeque<Book> arrayDeque = new ArrayDeque<>(books);
        System.out.println(formatOutput(arrayDeque));
    }

    public static void priorityQueueExample(List<Book> books) {
        System.out.println("PriorityQueue Example:");
        PriorityQueue<Book> priorityQueue = new PriorityQueue<>(books);
        System.out.println(formatOutput(priorityQueue));
    }

    public static void hashSetExample(List<Book> books) {
        System.out.println("HashSet Example:");
        HashSet<Book> hashSet = new HashSet<>(books);
        System.out.println(formatOutput(hashSet));
    }

    public static void treeSetExample(List<Book> books) {
        System.out.println("TreeSet Example:");
        TreeSet<Book> treeSet = new TreeSet<>(books);
        System.out.println(formatOutput(treeSet));
    }

    public static void hashMapExample(List<Book> books) {
        System.out.println("HashMap Example:");
        HashMap<Integer, Book> hashMap = new HashMap<>();
        for (int i = 0; i < books.size(); i++) {
            hashMap.put(i + 1, books.get(i));
        }
        System.out.println(formatMapOutput(hashMap));
    }

    public static void linkedHashMapExample(List<Book> books) {
        System.out.println("LinkedHashMap Example:");
        LinkedHashMap<Integer, Book> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < books.size(); i++) {
            linkedHashMap.put(i + 1, books.get(i));
        }
        System.out.println(formatMapOutput(linkedHashMap));
    }

    public static <T> String formatOutput(Collection<T> collection) {
        StringBuilder output = new StringBuilder();
        for (T obj : collection) {
            output.append(obj).append(" -> ");
        }
        output.append("null");
        return output.toString();
    }

    public static <K, V> String formatMapOutput(Map<K, V> map) {
        StringBuilder output = new StringBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            output.append(entry.getKey()).append(" : ").append(entry.getValue()).append(" -> ");
        }
        output.append("null");
        return output.toString();
    }
}

class Book implements Comparable<Book> {
    private long ISBN;
    private String name;
    private double price;

    public Book(long ISBN, String name, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book (ISBN: " + ISBN + " | Name: " + name + " | Price: " + price + ")";
    }

    @Override
    public int compareTo(Book o) {
        return Long.compare(this.ISBN, o.ISBN);
    }
}
