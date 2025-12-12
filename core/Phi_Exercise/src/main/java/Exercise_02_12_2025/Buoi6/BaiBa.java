package Exercise_02_12_2025.Buoi6;

import java.util.Scanner;

public class BaiBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        int result = a.compareTo(b);

        if (result == 0) {
            System.out.println("a = b");
        } else if (result < 0) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}
