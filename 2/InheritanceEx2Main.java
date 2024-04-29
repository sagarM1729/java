import java.util.Scanner;

public class InheritanceEx2Main {
    static class Department {
        protected String deptName;

        public Department(String deptName) {
            this.deptName = deptName;
        }
    }

    static class Employee extends Department {
        protected String empName;
        protected int empID;
        protected double salary;

        public Employee(String deptName, String empName, int empID, double salary) {
            super(deptName);
            this.empName = empName;
            this.empID = empID;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Allowance extends Employee {
        protected double allowance;

        public Allowance(String deptName, String empName, int empID, double salary, double allowance) {
            super(deptName, empName, empID, salary);
            this.allowance = allowance;
        }

        public double getAllowance() {
            return allowance;
        }

        public double getTotalSalary() {
            return salary + allowance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter employee details
        System.out.println("Enter details for Employee 1:");
        System.out.print("Department Name: ");
        String deptName1 = scanner.nextLine();
        System.out.print("Employee Name: ");
        String empName1 = scanner.nextLine();
        System.out.print("Employee ID: ");
        int empID1 = scanner.nextInt();
        System.out.print("Salary: ");
        double salary1 = scanner.nextDouble();
        System.out.print("Allowance: ");
        double allowance1 = scanner.nextDouble();

        System.out.println("Enter details for Employee 2:");
        scanner.nextLine(); // Consume newline character
        System.out.print("Department Name: ");
        String deptName2 = scanner.nextLine();
        System.out.print("Employee Name: ");
        String empName2 = scanner.nextLine();
        System.out.print("Employee ID: ");
        int empID2 = scanner.nextInt();
        System.out.print("Salary: ");
        double salary2 = scanner.nextDouble();
        System.out.print("Allowance: ");
        double allowance2 = scanner.nextDouble();

        Allowance emp1 = new Allowance(deptName1, empName1, empID1, salary1, allowance1);
        Allowance emp2 = new Allowance(deptName2, empName2, empID2, salary2, allowance2);

        // Print details of Employee 1
        System.out.println("Employee 1:");
        System.out.println("Department: " + emp1.deptName);
        System.out.println("Name: " + emp1.empName);
        System.out.println("ID: " + emp1.empID);
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Allowance: " + emp1.getAllowance());
        System.out.println("Total Salary: " + emp1.getTotalSalary());

        // Print details of Employee 2
        System.out.println("Employee 2:");
        System.out.println("Department: " + emp2.deptName);
        System.out.println("Name: " + emp2.empName);
        System.out.println("ID: " + emp2.empID);
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Allowance: " + emp2.getAllowance());
        System.out.println("Total Salary: " + emp2.getTotalSalary());

        scanner.close();
    }
}
