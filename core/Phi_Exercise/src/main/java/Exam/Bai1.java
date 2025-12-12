package Exam;

import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    public static int nhapSoNguyenDuong(Scanner sc){
        int x;
        do{
            System.out.println("Nhập vào số nguyên dương:");
            x = sc.nextInt();
            if(x<=0){
                System.out.println("Số bạn vừa nhập không phải là số nguyên dương, mời nhập lại!");
            }
        } while(x<=0);
        return x;
    }

    public static boolean ktrSoChinhPhuong(int x){
        return Math.sqrt(x) % 1 == 0;
    }

    public static void main(String[] args) {
        int x = nhapSoNguyenDuong(sc);
        if(ktrSoChinhPhuong(x)){
            System.out.printf("%d là số chính phương!",x);
        }
        else{
            System.out.printf("%d không phải là số chính phương!",x);
        }
    }
}
