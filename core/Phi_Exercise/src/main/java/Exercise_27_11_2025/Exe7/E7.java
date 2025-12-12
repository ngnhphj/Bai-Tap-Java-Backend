package Exercise_27_11_2025.Exe7;

import java.util.Scanner;

public class E7 {
    static Scanner sc = new Scanner(System.in);

    public static String name1;
    public static int age1;
    public static String gender1;
    public static double baseSalary1;
    public static double score1;

    public static String name2;
    public static int age2;
    public static String gender2;
    public static double baseSalary2;
    public static double score2;

    public static String name3;
    public static int age3;
    public static String gender3;
    public static double baseSalary3;
    public static double score3;

    public static String name4;
    public static int age4;
    public static String gender4;
    public static double baseSalary4;
    public static double score4;

    public static String name5;
    public static int age5;
    public static String gender5;
    public static double baseSalary5;
    public static double score5;

    public static void main(String[] args) {
        System.out.print("Nhập số lượng nhân viên cần nhập thông tin (1-5): ");
        int num = sc.nextInt();

        switch (num){
            case 5:
                enterInfo1();
            case 4:
                enterInfo2();
            case 3:
                enterInfo3();
            case 2:
                enterInfo4();
            case 1:
                enterInfo5();
        }

        switch (num){
            case 5:
                printInfo(name1, age1, gender1, baseSalary1, score1);
            case 4:
                printInfo(name2, age2, gender2, baseSalary2, score2);
            case 3:
                printInfo(name3, age3, gender3, baseSalary3, score3);
            case 2:
                printInfo(name4, age4, gender4, baseSalary4, score4);
            case 1:
                printInfo(name5, age5, gender5, baseSalary5, score5);
        }
    }

    public static void enterInfo1() {
        System.out.println("===== Nhập thông tin nhân viên 1 =====");
        System.out.print("Tên: ");
        name1 = sc.next();
        System.out.print("Tuổi: ");
        age1 = sc.nextInt();
        System.out.print("Giới tính: ");
        gender1 = sc.next();
        System.out.print("Lương cơ bản: ");
        baseSalary1 = sc.nextDouble();
        System.out.print("Điểm tốt nghiệp: ");
        score1 = sc.nextDouble();
    }

    public static void enterInfo2() {
        System.out.println("===== Nhập thông tin nhân viên 2 =====");
        System.out.print("Tên: ");
        name2 = sc.next();
        System.out.print("Tuổi: ");
        age2 = sc.nextInt();
        System.out.print("Giới tính: ");
        gender2 = sc.next();
        System.out.print("Lương cơ bản: ");
        baseSalary2 = sc.nextDouble();
        System.out.print("Điểm tốt nghiệp: ");
        score2 = sc.nextDouble();
    }

    public static void enterInfo3() {
        System.out.println("===== Nhập thông tin nhân viên 3 =====");
        System.out.print("Tên: ");
        name3 = sc.next();
        System.out.print("Tuổi: ");
        age3 = sc.nextInt();
        System.out.print("Giới tính: ");
        gender3 = sc.next();
        System.out.print("Lương cơ bản: ");
        baseSalary3 = sc.nextDouble();
        System.out.print("Điểm tốt nghiệp: ");
        score3 = sc.nextDouble();
    }

    public static void enterInfo4() {
        System.out.println("===== Nhập thông tin nhân viên 4 =====");
        System.out.print("Tên: ");
        name4 = sc.next();
        System.out.print("Tuổi: ");
        age4 = sc.nextInt();
        System.out.print("Giới tính: ");
        gender4 = sc.next();
        System.out.print("Lương cơ bản: ");
        baseSalary4 = sc.nextDouble();
        System.out.print("Điểm tốt nghiệp: ");
        score4 = sc.nextDouble();
    }

    public static void enterInfo5() {
        System.out.println("===== Nhập thông tin nhân viên 5 =====");
        System.out.print("Tên: ");
        name5 = sc.next();
        System.out.print("Tuổi: ");
        age5 = sc.nextInt();
        System.out.print("Giới tính: ");
        gender5 = sc.next();
        System.out.print("Lương cơ bản: ");
        baseSalary5 = sc.nextDouble();
        System.out.print("Điểm tốt nghiệp: ");
        score5 = sc.nextDouble();
    }

    public static void printInfo(String name, int age, String gender, double baseSalary, double score){
        System.out.println("===== Thông tin nhân viên =====");
        System.out.println("Tên :" + name);
        System.out.println("Tuổi :" + age);
        System.out.println("Giới tính :" + gender);
        System.out.println("Lương cơ bản :" + baseSalary);
        System.out.println("Điểm trung bình tốt nghiệp đại học :" + score);
    }
}
