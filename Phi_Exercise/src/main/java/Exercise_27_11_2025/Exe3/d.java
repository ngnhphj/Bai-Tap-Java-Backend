package Exercise_27_11_2025.Exe3;

import java.util.Scanner;

public class d {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Tích từ 1 đến " + n + " là: " + calTime(n));
    }

    static int calTime(int n)
    {
        int sum = 1;
        for(int i = 1; i<=n;i++)
        {
            sum *= i;
        }
        return sum;
    }
}
