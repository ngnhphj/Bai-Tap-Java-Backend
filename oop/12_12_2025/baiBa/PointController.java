package day_01.exercise.baiBa;

import java.util.Scanner;

public class PointController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point point1 = new Point();
        Point point2 = new Point();
        System.out.println("===Nhập tọa độ cho điểm thứ nhất ");
        point1.nhap(sc);

        System.out.println("===Nhập tọa độ cho điểm thứ hai ");
        point2.nhap(sc);
        System.out.print("Tọa độ điểm thứ nhất là:");
        point1.xuat();
        System.out.print("Tọa độ điểm thứ hai là:");
        point2.xuat();

        System.out.println("Khoảng cách từ điểm thứ nhất tới điểm thứ hai là: " + point1.khoangCach(point2));
    }
}
