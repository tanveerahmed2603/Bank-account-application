package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // ask how many students we want to add
        // create n number of students
        System.out.print("Enter the number of new students to add: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i=0; i<numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println("\nPassing to the next student\n");

        }

        for (int i =0; i < numberOfStudents; i++) {
            System.out.println("\n****** Student Information ******");
            System.out.println(students[i].showInfo());
        }


    }

}
