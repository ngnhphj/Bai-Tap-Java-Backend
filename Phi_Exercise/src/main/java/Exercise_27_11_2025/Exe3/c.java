package Exercise_27_11_2025.Exe3;

import java.util.Scanner;

public class c {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Tổng từ 1 đến " + n + " nghịch đảo là: " + calSum(n));
    }

    static double calSum(int n)
    {
        double sum = 0;
        for(int i = 1; i<=n;i++)
        {
            sum += (1.0/i);
        }
        return sum;
    }
}
