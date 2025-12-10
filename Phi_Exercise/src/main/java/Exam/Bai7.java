package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> hoTen = new ArrayList<>();
    static ArrayList<Integer> tuoi = new ArrayList<>();
    static ArrayList<String> gioiTinh = new ArrayList<>();
    static ArrayList<Double> luongCB = new ArrayList<>();
    static ArrayList<Double> diemTB = new ArrayList<>();

    public static void nhap(){
        String hoten = sc.next();
        hoTen.add(hoten);
        int Tuoi = sc.nextInt();
        tuoi.add(Tuoi);
        String gender = sc.next();
        gioiTinh.add(gender);
        Double luongcb = sc.nextDouble();
        luongCB.add(luongcb);
        Double diemtb = sc.nextDouble();
        diemTB.add(diemtb);
    }

    public static void xuat(){
        for(int i=0;i<hoTen.size();i++){
            System.out.printf("===Thông tin nhân viên thứ %d===",i+1);
            System.out.println();
            System.out.println("Họ và tên:" + hoTen.get(i));
            System.out.println("Tuổi:" + tuoi.get(i));
            System.out.println("Giới tính:" + gioiTinh.get(i));
            System.out.println("Lương cơ bản:" + luongCB.get(i));
            System.out.println("Điểm trung bình:" + diemTB.get(i));
        }
    }

    public static void timNVTheoTen(String ten){
        for(int i=0;i<hoTen.size();i++){
            if(ten.equalsIgnoreCase(hoTen.get(i))){
                System.out.println("Nhân viên cần tìm:");
                System.out.println("Họ và tên:" + hoTen.get(i));
                System.out.println("Tuổi:" + tuoi.get(i));
                System.out.println("Giới tính:" + gioiTinh.get(i));
                System.out.println("Lương cơ bản:" + luongCB.get(i));
                System.out.println("Điểm trung bình:" + diemTB.get(i));
            }
        }
    }

    public static double timMin(){
        double min = diemTB.get(0);
        for(double i : diemTB){
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }

    public static void timNVTheoDiemTB(){
        double diemTBMin=timMin();
        for(int i=0;i<diemTB.size();i++){
            if(diemTBMin==diemTB.get(i)){
                System.out.println("Họ và tên:" + hoTen.get(i));
                System.out.println("Tuổi:" + tuoi.get(i));
                System.out.println("Giới tính:" + gioiTinh.get(i));
                System.out.println("Lương cơ bản:" + luongCB.get(i));
                System.out.println("Điểm trung bình:" + diemTB.get(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            nhap();
        }
        xuat();
        System.out.print("Nhập tên nhân viên cần tìm:");
        String ten = sc.next();
        timNVTheoTen(ten);
        System.out.print("Nhân viên có điểm trung bình thấp nhất là:");
        timNVTheoDiemTB();
    }
}
