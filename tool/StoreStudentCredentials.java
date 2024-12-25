package tool;

import java.util.Scanner;

class StoreStudentCredentials {
    private Scanner scanner = new Scanner(System.in);
    private String studentName;
    private String studentDepartment;
    private String studentGrades;
    private String[] grades;

    public String getstudentName() throws Exception {
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine();
        return studentName;
    }

    public String getstudentDepartMent() throws Exception {
        System.out.print("Enter your department: ");
        studentDepartment = scanner.nextLine();
        return studentDepartment;
    }

    public String[] getstudentGrades() throws Exception {
        if (studentGrades == null) { // Ensure grades are only read once
            System.out.print("Enter your grades (separated by spaces): ");
            studentGrades = scanner.nextLine();
            grades = studentGrades.split("\\s+");
        }
        return grades;
    }
}
