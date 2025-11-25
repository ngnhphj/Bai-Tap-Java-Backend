package day_04.exe;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        int distance = 1;
        int count = 0;
        for(int i=2;i<=n;i+=2)
        {
            if(count==distance)
            {
                System.out.print((-i) + " ");
                count = 0;
                distance ++;
            }
            else{
                System.out.print(i + " ");
                count ++;
            }
        }
    }
}
