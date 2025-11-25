package day_04.exe;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        //nhập số nguyên dương n
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while(n<0);
        //cách 1:in ra các số lẻ trong phạm vi từ 1 đến n
        for(int i = 1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //cách 2: tăng biến đếm để không kiểm tra n lẻ nữa 
        for(int i = 1;i<=n;i+=2)
        {
                System.out.print(i + " ");
        }
    }
}
