package Exercise_27_11_2025.Exe2;

import java.util.Scanner;

public class g {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Tổng các số chính phương là: " + calculateTotalSquareDigits(n));
    }

    public static int calculateTotalSquareDigits(int x){
        int sum = 0;
        while(x>0){
            int temp = x % 10;
            if(isSquareNumber(temp)){
                sum += temp;
            }
            x /= 10;
        }
        return sum;
    }

    static boolean isSquareNumber(int x) {
        return Math.sqrt(x) % 1 == 0;
    }
}
