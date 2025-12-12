package day_01.exercise.baiMot;

import java.util.Scanner;

public class Student {
    String name;
    float mathScore;
    float literatureScore;

    public void input(Scanner sc) {
        System.out.print("Enter student name:");
        name = sc.nextLine();
        System.out.print("Enter math score:");
        mathScore = Float.parseFloat(sc.nextLine());
        System.out.print("Enter literature score:");
        literatureScore = Float.parseFloat(sc.nextLine());
    }

    public void output() {
        System.out.println("Student name: " + name);
        System.out.println("Math score: " + mathScore);
        System.out.println("Literature score: " + literatureScore);
        System.out.println("Average score: " + calculateAverageScore());
    }

    public float calculateAverageScore(){
        return (mathScore + literatureScore) / 2;
    }
}
