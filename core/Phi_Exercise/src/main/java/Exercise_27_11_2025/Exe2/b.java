package Exercise_27_11_2025.Exe2;

import java.util.Scanner;

public class b {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        if(isSymmetricalNumber(n))
        {
            System.out.println("Số đối xứng!");
        } else{
            System.out.println("Số klhoong đối xứng!");
        }
    }

    public static boolean isSymmetricalNumber(int a) {
        return reversedNumber(a) == a;
    }

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
