package day_04.exe;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //in ra dãy số chẵn từ 2 đến 2n
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        for(int i =2;i<=2*n;i+=2)
        {
            System.out.print(i + " ");
        }
    }
}
