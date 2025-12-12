package Exercise_27_11_2025.Exe2;

import java.util.Scanner;

public class c {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        if (isSquareNumber(n)) {
            System.out.println("Số chính phương!");
        } else {
            System.out.println("Khôn phải số chính phương!");
        }
    }

    static boolean isSquareNumber(int x) {
        return Math.sqrt(x) % 1 == 0;
    }
}
