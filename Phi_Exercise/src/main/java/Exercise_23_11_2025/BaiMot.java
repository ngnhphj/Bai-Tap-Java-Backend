package Exercise_23_11_2025;

import java.util.Scanner;

public class BaiMot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên dương:");
        int x = sc.nextInt();
        while (x < 0) {
            System.out.print("Số bạn vừa nhập không phải là số nguyên dương. Mời nhập lại: ");
            x = sc.nextInt();
        }
        if (Math.sqrt(x) % 1 == 0) {
            System.out.printf("%d là số chính phương!", x);
        } else {
            System.out.printf("%d không phải là số chính phương!", x);
        }
    }
}
