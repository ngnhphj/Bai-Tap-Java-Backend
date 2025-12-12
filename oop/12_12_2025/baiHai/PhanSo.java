package day_01.exercise.baiHai;

import java.util.Scanner;

public class PhanSo {
    int tuSo;
    int mauSo;

    public void nhap(Scanner sc) {
        System.out.print("Nhập tử số: ");
        tuSo = Integer.parseInt(sc.nextLine());
        do {
            System.out.print("Nhập mẫu số: ");
            mauSo = Integer.parseInt(sc.nextLine());
            if (mauSo == 0) {
                System.out.println("Mẫu số phải khác 0!");
            }
        } while (mauSo == 0);
    }

    public int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 1 || b == 1) {
            return 1;
        }
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void xuat() {
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        int uCLN = timUCLN(tuSo, mauSo);
        tuSo /= uCLN;
        mauSo /= uCLN;
        if(mauSo == 1){
            System.out.printf("Phân số là: %d\n", tuSo);
        }
        else {
            System.out.printf("Phân số là: %d/%d\n", tuSo, mauSo);
        }
    }

    public PhanSo cong(PhanSo other){
        PhanSo result = new PhanSo();
        result.tuSo = tuSo * other.mauSo + other.tuSo * mauSo;
        result.mauSo = mauSo * other.mauSo;
        return result;
    }

    public PhanSo tru(PhanSo other){
        PhanSo result = new PhanSo();
        result.tuSo = tuSo * other.mauSo - other.tuSo * mauSo;
        result.mauSo = mauSo * other.mauSo;
        return result;
    }

    public PhanSo nhan(PhanSo other){
        PhanSo result = new PhanSo();
        result.tuSo = tuSo * other.tuSo;
        result.mauSo = mauSo * other.mauSo;
        return result;
    }

    public PhanSo chia(PhanSo other){
        PhanSo result = new PhanSo();
        result.tuSo = tuSo * other.mauSo;
        result.mauSo = mauSo * other.tuSo;
        return result;
    }

    public void kiemTraPhanSo(){
        if(tuSo*mauSo<0||tuSo==0){
            System.out.println("Phân số là phân số dương!");
        } else{
            System.out.println("Phân số là phân số âm!");
        }
    }

    public void kiemTraPhanSoBangKhong(){
        if(tuSo==0){
            System.out.println("Phân số bằng 0!");
        }
    }
}
