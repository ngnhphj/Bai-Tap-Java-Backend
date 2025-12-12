package day_01.exercise.baiBa;

import java.util.Scanner;

public class Point {
    int x, y;

    public void nhap(Scanner sc) {
        System.out.print("Nhập hoành độ : ");
        x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tung độ : ");
        y = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        System.out.printf(" (%d,%d) ", x, y);
    }

    public double khoangCach(Point other) {
        int x1 = x;
        int y1 = y;
        int x2 = other.x;
        int y2 = other.y;
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
