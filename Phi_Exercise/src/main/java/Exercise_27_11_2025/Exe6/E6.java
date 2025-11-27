package Exercise_27_11_2025.Exe6;

import java.util.Scanner;

public class E6 {
    static Scanner sc = new Scanner(System.in);

    public static String name;
    public static int age;
    public static String gender;
    public static double baseSalary;
    public static double score;

    public static void main(String[] args) {
        System.out.print("Nhập tên của nhân viên: ");
        name = sc.next();
        System.out.print("Nhập tuổi của nhân viên: ");
        age = sc.nextInt();
        System.out.print("Nhập giới tính của nhân viên: ");
        gender = sc.next();
        System.out.print("Nhập lương cơ bản của nhân viên: ");
        baseSalary = sc.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp đại học của nhân viên: ");
        score = sc.nextDouble();

        printInfo(name,age, gender,baseSalary,score);
    }

    public static void  printInfo(String name, int age, String gender, double baseSalary, double score){
        System.out.println("===== Thông tin nhân viên =====");
        System.out.println("Tên :" + name);
        System.out.println("Tuổi :" + age);
        System.out.println("Giới tính :" + gender);
        System.out.println("Lương cơ bản :" + baseSalary);
        System.out.println("Điểm trung bình tốt nghiệp đại học :" + score);
    }
}
