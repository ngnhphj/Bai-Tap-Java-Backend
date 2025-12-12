package Exercise_27_11_2025.Exe5;

import java.util.Scanner;

public class E5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        printFib(n);
    }

    static void printFib(int x)
    {
        int f1 =0;
        System.out.print(f1 + " ");
        int f2 = 1;
        System.out.print(f2 + " ");
        int fn = f1+f2;
        while(fn<x){
            System.out.print(fn + " ");
            f1=f2;
            f2=fn;
            fn = f1+f2;
        }
    }
}
