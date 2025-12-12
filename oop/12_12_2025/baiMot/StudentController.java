package day_01.exercise.baiMot;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int n;
        do{
            System.out.print("Enter number of student: ");
            n = Integer.parseInt(sc.nextLine());
            if(n<=0){
                System.out.println("Number of student can't be negative number!");
            }
            System.out.println();
        } while(n<=0);

        Student student;
        System.out.println("=========== Enter student information ============");
        for(int i = 0; i<n;i++){
            student = new Student();
            System.out.println("Student " + (i+1));
            student.input(sc);
            students.add(student);
            System.out.println();
        }

        System.out.println("+++++++++++ Student information ++++++++++++");
        for(int i = 0;i<n;i++){
            System.out.println("Student " + (i+1));
            students.get(i).output();
            System.out.println();
        }
    }
}
