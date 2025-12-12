package day_04.exe;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        double sum = 1;
        for(int i = 2;i <= n; i ++)
        {
            sum += (1.0/i);
        }
        System.out.println("Tổng là: " + sum);
    }
}
