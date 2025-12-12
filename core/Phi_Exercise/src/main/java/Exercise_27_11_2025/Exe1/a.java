package day_05.exercise.Exe1;

import java.util.Scanner;

public class a {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập vào 1 kí tự: ");
        char c = sc.next().charAt(0);
        System.out.println("Kí tự vừa nhập là: " + c);
        change(c);
    }

    static void change(char x)
    {
        if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
            if (x <= 'Z') {
                x += 32;
                System.out.println("Chuyển thành chữ thường: " + x);
            } else {
                x -= 32;
                System.out.println("Chuyển thành chữ hoa: " + x);
            }
        } else {
            System.out.println("Không phải chữ cái!");
        }
    }

}
