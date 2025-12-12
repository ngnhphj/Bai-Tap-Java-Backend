package Exercise_27_11_2025.Exe2;

import java.util.Scanner;

public class d {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        if(isPrimeNumber(n))
        {
            System.out.println("Số nguyên tố!");
        } else{
            System.out.println("Không phải số nguyên tố!");
        }
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
