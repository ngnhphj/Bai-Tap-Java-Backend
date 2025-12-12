package day_05.exercise.Exe1;

import java.util.Scanner;

public class c {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        System.out.print("Nhập hệ số a: ");
        a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        c = sc.nextDouble();
        System.out.println("Phương trình bậc hai là: " + a + "x^2" + "+" + b + "x" + "+" + c);
        levelTwo(a, b, c);
    }

    static void levelTwo(double a, double b, double c) {
        double x;
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", " + "x2 =" + x2);
            }
        }
    }
}
