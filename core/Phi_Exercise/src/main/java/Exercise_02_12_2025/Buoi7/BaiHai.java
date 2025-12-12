package Exercise_02_12_2025.Buoi7;

import java.util.Scanner;

public class BaiHai {

    public static void inputEmployee(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB, int index, Scanner sc) {
        sc.nextLine();
        System.out.println("Nhập thông tin nhân viên thứ " + (index + 1));
        System.out.print("Họ tên: ");
        hoTen[index] = sc.nextLine();

        System.out.print("Tuổi: ");
        tuoi[index] = sc.nextInt();
        sc.nextLine();

        System.out.print("Giới tính: ");
        gioiTinh[index] = sc.nextLine();

        System.out.print("Lương cơ bản: ");
        luongCoBan[index] = sc.nextDouble();

        System.out.print("Điểm TB (0-10): ");
        diemTB[index] = sc.nextDouble();
    }

    public static void outputEmployee(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB, int index) {
        System.out.println("=== Nhân viên thứ " + (index + 1) + " ===");
        System.out.println("Họ tên     : " + hoTen[index]);
        System.out.println("Tuổi       : " + tuoi[index]);
        System.out.println("Giới tính  : " + gioiTinh[index]);
        System.out.println("Lương cơ bản: " + luongCoBan[index]);
        System.out.println("Điểm TB    : " + diemTB[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nhân viên n: ");
        int n = sc.nextInt();

        String[] hoTen = new String[n];
        int[] tuoi = new int[n];
        String[] gioiTinh = new String[n];
        double[] luongCoBan = new double[n];
        double[] diemTB = new double[n];

        for (int i = 0; i < n; i++) {
            inputEmployee(hoTen, tuoi, gioiTinh, luongCoBan, diemTB, i, sc);
        }

        System.out.println("\n===== DANH SÁCH NHÂN VIÊN =====");
        for (int i = 0; i < n; i++) {
            outputEmployee(hoTen, tuoi, gioiTinh, luongCoBan, diemTB, i);
            System.out.println("---------------------------------");
        }

    }
}
