import java.util.Scanner;

interface College {
    String COLLEGE_NAME = "XYZ College"; // field of the interface

    String getCollegeName(); // method to get the college name
}

class Teacher {
    String name;
    String qualification;

    public Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }
}

class Department extends Teacher {
    int deptNo;
    String deptName;

    public Department(String name, String qualification, int deptNo, String deptName) {
        super(name, qualification);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public String getDeptName() {
        return deptName;
    }
}

class CollegeImpl extends Department implements College {
    public CollegeImpl(String name, String qualification, int deptNo, String deptName) {
        super(name, qualification, deptNo, deptName);
    }

    public String getCollegeName() {
        return COLLEGE_NAME;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter teacher's details
        System.out.print("Enter teacher's name: ");
        String teacherName = scanner.nextLine();
        
        System.out.print("Enter teacher's qualification: ");
        String teacherQualification = scanner.nextLine();
        
        System.out.print("Enter department number: ");
        int deptNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();

        CollegeImpl college = new CollegeImpl(teacherName, teacherQualification, deptNo, deptName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("Teacher Name: " + college.getName());
        System.out.println("Teacher Qualification: " + college.getQualification());
        System.out.println("Department No:" + college.getDeptNo());
        System.out.println("Department Name: " + college.getDeptName());

        scanner.close();
    }
}
