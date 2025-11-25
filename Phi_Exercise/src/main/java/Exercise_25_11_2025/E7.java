package day_04.exe;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        for(int i=1;i<=n;i=2*i+1)
        {
            System.out.print(i + " ");
        }
    }
}
