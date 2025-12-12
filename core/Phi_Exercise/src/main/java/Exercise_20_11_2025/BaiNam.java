package Exercise_20_11_2025;

import java.util.Scanner;

public class BaiNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Nhập vào biển số xe(5 chữ số): ");
        do{
            x = sc.nextInt();
        } while(x > 99999 || x < 10000);
        int tong=0;
        int bsx = x;
        for(int i=0;i<5;i++)
        {
            tong += x%10;
            x/=10;
        }
        System.out.println(tong%10);
        System.out.println("Số nút của biển số xe " + bsx + " là: " + (tong%10));
    }
}
