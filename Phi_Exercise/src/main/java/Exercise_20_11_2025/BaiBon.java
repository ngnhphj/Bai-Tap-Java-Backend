package Exercise_20_11_2025;

import java.util.Scanner;

public class BaiBon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Nhập vào bán kính hình tròn: ");
        double r = sc.nextDouble();
        double CV = 2 * r * pi;
        double DT = pi * r * r;
        System.out.println("Bán kính đã nhập: " + r);
        System.out.println("Chu vi của hình tròn: " + CV);
        System.out.println("Diện tích của hình tròn: " + DT);
    }
}
