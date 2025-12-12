package day_01.exercise.baiHai;

import java.util.Scanner;

public class PhanSoController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();
        System.out.println("Nhập phân số thứ nhất");
        phanSo1.nhap(sc);
        phanSo1.xuat();
        System.out.println("Nhập phân số thứ hai");
        phanSo2.nhap(sc);
        phanSo2.xuat();
        System.out.println();
        System.out.println("Tổng hai phân số là:");
        phanSo1.cong(phanSo2).xuat();
        System.out.println("Hiệu hai phân số là:");
        phanSo1.tru(phanSo2).xuat();
        System.out.println("Tích hai phân số là:");
        phanSo1.nhan(phanSo2).xuat();
        System.out.println("Thương hai phân số là:");
        phanSo1.chia(phanSo2).xuat();
        System.out.println("=========================");
        phanSo1.kiemTraPhanSo();
        phanSo1.kiemTraPhanSoBangKhong();
//        System.out.println(phanSo1.timUCLN(-4,-6));
    }
}
