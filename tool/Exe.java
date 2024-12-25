package tool;

public class Exe {
    StoreStudentCredentials ssc = new StoreStudentCredentials();
    //


    public int gradeToPoint(String grade) {
        switch (grade) {
            case "A":
                return 5;
            case "B":
                return 4;
            case "C":
                return 3;
            case "D":
                return 2;
            case "E":
                return 1;
            case "F":
                return 0;
            default:
                return 0;
        }
    }

    public void getCredentials() {
        try {
           String name =  ssc.getstudentName();
            String department = ssc.getstudentDepartMent();
            String [] grades = ssc.getstudentGrades();
            int totalPoints = 0;
            for (String grade : grades) {
                totalPoints += gradeToPoint(grade.toUpperCase());
            }

            double cgpa = (double) totalPoints / ssc.getstudentGrades().length;
            System.out.println(grades.length);
            System.out.println("Dear " + name + " from " + department + " Department" + "\n" + "Your CGPA is " + String.format("%.2f", cgpa));



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}