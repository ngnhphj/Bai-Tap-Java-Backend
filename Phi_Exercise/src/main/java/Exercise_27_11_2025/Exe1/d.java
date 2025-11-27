package day_05.exercise.Exe1;

import java.util.Scanner;

public class d {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so thu nhat: ");
        int s1 = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int s2 = sc.nextInt();
        System.out.print("Nhap so thu ba: ");
        int s3 = sc.nextInt();
        System.out.print("Nhap so thu bon: ");
        int s4 = sc.nextInt();
        System.out.println("So nho nhat trong 4 so vua nhap la : " + min(min(min(s1, s2), s3), s4));

    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }
}
