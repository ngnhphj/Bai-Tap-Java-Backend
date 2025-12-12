package Exercise_27_11_2025.Exe3;

import java.util.Scanner;

public class e {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Tổng giai thừa từ 1 đến " + n + " là: " + calSum(n));
    }

    static int calSum(int n)
    {
        int sum = 1;
        for(int i = 1; i<=n;i++)
        {
            sum *= tinhGiaiThua(i);
        }
        return sum;
    }
    static int tinhGiaiThua(int x){
        int gt = 1;
        for(int i = 1; i<=x ; i++){
            gt*=i;
        }
        return gt;
    }
}
