// import java.util.Scanner;

// class STUDENT {
//     int PRN;
//     String Name;
//     int age;

//     void getData() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter PRN, Name and Age: ");
//         PRN = sc.nextInt();
//         Name = sc.next();
//         age = sc.nextInt();
//     }
// }

// class UGSTUDENT extends STUDENT {
//     int semester;
//     double fees;

//     void getUGData() {
//         getData();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Semester and Fees: ");
//         semester = sc.nextInt();
//         fees = sc.nextDouble();
//     }
// }

// class PGSTUDENT extends STUDENT {
//     int semester;
//     double fees;
//     double stipend;

//     void getPGData() {
//         getData();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Semester, Fees, and Stipend: ");
//         semester = sc.nextInt();
//         fees = sc.nextDouble();
//         stipend = sc.nextDouble();
//     }
// }

// public class example {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n, m;
//         System.out.println("Enter the number of UG students: ");
//         n = sc.nextInt();
//         UGSTUDENT[] ug = new UGSTUDENT[n];
//         double[] sumAgeUG = new double[8];
//         double[] countUG = new double[8];
//         for (int i = 0; i < n; i++) {
//             ug[i] = new UGSTUDENT();
//             ug[i].getUGData();
//             sumAgeUG[ug[i].semester] += ug[i].age;
//             countUG[ug[i].semester]++;
//         }
//         System.out.println("Enter the number of PG students: ");
//         m = sc.nextInt();
//         PGSTUDENT[] pg = new PGSTUDENT[m];
//         double[] sumAgePG = new double[8];
//         double[] countPG = new double[8];
//         for (int i = 0; i < m; i++) {
//             pg[i] = new PGSTUDENT();
//             pg[i].getPGData();
//             sumAgePG[pg[i].semester] += pg[i].age;
//             countPG[pg[i].semester]++;
//         }
//         System.out.println("Semester wise average age of UG students:");
//         for (int i = 1; i <= 7; i++) {
//             if (countUG[i] != 0) {
//                 System.out.println("Semester "+ i + ": " + sumAgeUG[i] / countUG[i]);
//             }
//         }
//         System.out.println("Semester wise average age of PG students:");
//         for (int i = 1; i <= 7; i++) {
//             if (countPG[i] != 0) {
//                 System.out.println("Semester "+ i + ": " + sumAgePG[i] / countPG[i]);
//             }
//         }
//     }
// }
