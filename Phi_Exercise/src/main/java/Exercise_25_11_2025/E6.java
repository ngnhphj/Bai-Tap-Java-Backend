package day_04.exe;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        int f1=0;
        int f2=1;
        int fn=f1+f2;
        while(fn<=n)
        {
            System.out.print(fn + " ");
            f1=f2;
            f2=fn;
            fn=f1+f2;
        }

    }
}
