package day_05.exercise.Exe1;

import java.util.Scanner;

public class b {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap vao he so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao he so b: ");
        double b = sc.nextDouble();
        System.out.println("Phuong trinh vua nhap la: " + a + "x + " + b);
        levleOne(a,b);
    }

    static void levleOne(double a, double b){
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phuong trinh vo so nghiem!");
            }
            else{
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
        else{
            System.out.println("Nghiem cua phuong trinh la x = " + (-b/a));
        }
    }
}
