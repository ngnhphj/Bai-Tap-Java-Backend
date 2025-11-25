package day_04.exe;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        //in dãy giá trị chẵn xen kẽ dương âm: 2, -4, 6, -8, ..., n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i % 4 == 0) {
                    System.out.println((-i) + " ");
                } else System.out.println(i + " ");
            }
        }
    }
}
