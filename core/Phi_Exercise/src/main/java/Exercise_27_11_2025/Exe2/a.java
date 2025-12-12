package Exercise_27_11_2025.Exe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Số đảo là :" + reversedNumber(n));
    }

    //tra ve so dao cua so do
    public static int reversedNumber(int a) {
        int rNum = 0;
        if (a < 10) {
            return a;
        }
        while (a >= 1) {
            rNum = rNum * 10 + a % 10;
            a /= 10;
        }
        return rNum;
    }
}
