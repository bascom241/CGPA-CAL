package tools;
import java.util.Scanner;
public class storeStudentCredentials {
    Scanner scanner = new Scanner(System.in);
    private String studentName;
    private String studentDepartment;
    private final String studentGrades = scanner.nextLine();
    private String[] grades;
    int totalPoints = 0;

public void getstudentName(){
    try{
        studentName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Your name is " + studentName);
    }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
}

public void getstudentDepartMent(){
    try{
        studentDepartment = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Your DepartMent is " + studentDepartment);
    }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
}

public void getstudentGrades(){
    grades = studentGrades.split("\\s+", 0);
}

}
