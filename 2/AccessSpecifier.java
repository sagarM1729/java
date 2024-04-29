// class Person {
//     protected String name;
//     protected int age;
//     private String address;

//     public Person(String name, int age, String address) {
//         this.name = name;
//         this.age = age;
//         this.address = address;
//     }

//     protected void walk() {
//     System.out.println(name + " is walking");
//     }

//     private void speak() {
//     System.out.println(name + " is speaking");
//     }
// }

// class Student extends Person {
//     protected int grade;

//     public Student(String name, int age,
//             String address, int grade) {
//         super(name, age, address);
//         this.grade = grade;
//     }

//     protected void study() {
//     System.out.println(name + " is studying");
//     }
// }

// class Teacher extends Person {
//     private String subject;

//     public Teacher(String name, int age,
//             String address, String subject) {
//         super(name, age, address);
//         this.subject = subject;
//     }

//     public void teach() {
//     System.out.println(name + " is teaching " + subject);
//     }
// }

// public class AccessSpecifier {
//     public static void main(String[] args) {
//         Student student = new Student("Himanshu", 19, "Hinganghat ",69);
//         student.walk();
//         student.study();
//         Teacher teacher = new Teacher("Rupesh", 19, "Pune", "Backend");
//         teacher.walk();
//         teacher.teach();
//     }
// }
