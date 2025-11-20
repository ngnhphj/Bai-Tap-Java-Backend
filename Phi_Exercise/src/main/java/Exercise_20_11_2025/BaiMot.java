package Exercise_20_11_2025;

import java.util.Scanner;

public class BaiMot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số thứ hai( khác 0): ");
        int b;
        do {
            b = sc.nextInt();
        } while(b==0);
        System.out.println("Số thứ nhất là: " + a);
        System.out.println("Số thứ hai là: " + b);
        System.out.println("Tổng: " + (a+b));
        System.out.println("Hiệu: " + (a-b));
        System.out.println("Tích: " + (a*b));
        System.out.println("Thương: " + ((float)a/b));

    }
}
