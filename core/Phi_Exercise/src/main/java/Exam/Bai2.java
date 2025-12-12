package Exam;

import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);

    public static void fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = f1 + f2;
        while (fn < n) {
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }

    public static void main(String[] args) {
        int n = Bai1.nhapSoNguyenDuong(sc);
        System.out.printf("Dãy fibonacci đến %d là:", n);
        fibonacci(n);
    }
}
