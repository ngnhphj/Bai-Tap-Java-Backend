package Exercise_27_11_2025.Exe2;

import java.util.Scanner;

public class f {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Tổng các chữ số nguyên tố là: " + calculateTotalPrimeDigits(n));
    }

    public static int calculateTotalPrimeDigits(int x)
    {
        int sum = 0;
        while(x>0){
            int temp = x%10;
            if(isPrimeNumber(temp))
            {
                sum += temp;
            }
            x /= 10;
        }
        return sum;
    }

    static boolean isPrimeNumber(int x) {
        int count =0;
        for(int i=2;i<= (x/2); i++)
        {
            if(x%i==0)
            {
                count ++;
            }
        }
        return count <= 0;
    }
}
