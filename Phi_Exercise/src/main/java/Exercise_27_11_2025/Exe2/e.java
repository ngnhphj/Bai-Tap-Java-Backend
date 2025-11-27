package Exercise_27_11_2025.Exe2;

import java.util.Scanner;

public class e {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Tổng các chữ số lẻ là: " + calculateTotalOddDigits(n));
    }

    public static int calculateTotalOddDigits(int x)
    {

        int sum = 0;
        while(x>0)
        {
            int temp = x%10;
            if(temp % 2 != 0)
            {
                sum += temp;
            }
            x /=10;
        }
        return sum;
    }
}
