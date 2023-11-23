
public class School {

    static int totalStudents = 0; // Static variable to store total number of students

    String studentName; // Instance variable to store name of a student
    int studentID; // Instance variable to store student ID

    public static void main(String[] args) {
        // Creating students using instance variables
        School student1 = new School();
        student1.studentName = "Jane Smith";
        student1.studentID = totalStudents + 1;
        totalStudents++;

        School student2 = new School();
        student2.studentName = "John Doe";
        student2.studentID = totalStudents + 1;
        totalStudents++;

        // Displaying student details
        System.out.println("Student Details:");
        System.out.println("Student ID: " + student1.studentID);
        System.out.println("Name: " + student1.studentName);
        System.out.println("---------------------------");
        System.out.println("Student ID: " + student2.studentID);
        System.out.println("Name: " + student2.studentName);
        System.out.println("---------------------------");

        // Accessing static variable
        System.out.println("Total Students in the School: " + totalStudents);
    }
}
