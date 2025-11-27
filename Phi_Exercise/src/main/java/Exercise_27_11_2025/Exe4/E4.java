package Exercise_27_11_2025.Exe4;

import java.util.Scanner;

public class E4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b;
        do {
            System.out.print("Nhập vào số nguyên dương a: ");
            a = sc.nextInt();
        } while (a < 1);
        do {
            System.out.print("Nhập vào số nguyên dương b: ");
            b = sc.nextInt();
        } while (b < 1);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + uCLN(a,b));
    }

    static int uCLN(int a, int b)
    {
        int temp = Math.max(a, b);
        for(int i = temp; i>1; i--)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
        }
        return 1;
    }
}
