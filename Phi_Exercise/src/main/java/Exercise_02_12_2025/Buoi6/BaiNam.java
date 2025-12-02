package Exercise_02_12_2025.Buoi6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BaiNam {
    public static void main(String[] args) {
        // a
        String strDay = "02/28/2025";
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(strDay, fmt1);
        System.out.println("a. " + date);

        // b
        LocalDate today = LocalDate.now();
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String todayStr = today.format(fmt2);
        System.out.println("b. Ngày hiện tại: " + todayStr);

        // c
        LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        System.out.println("c. Thời gian hiện tại: ");
        System.out.println("Ngày: " + day);
        System.out.println("Tháng: " + month);
        System.out.println("Năm: " + year);
        System.out.println("Giờ: " + hour);
        System.out.println("Phút: " + minute);
        System.out.println("Giây: " + second);

        // d
        LocalDate preDay = today.minusDays(1000);
        System.out.println("d. Cách đây 1000 ngày là ngày: " + preDay.format(fmt2));

        // e
        Scanner sc = new Scanner(System.in);
        System.out.print("e. Nhập ngày (dd/MM/yyyy): ");
        String dateInput = sc.nextLine();
        System.out.print("Nhập số ngày muốn công thêm: ");
        int n = sc.nextInt();
        LocalDate inputDate = LocalDate.parse(dateInput, fmt2);
        LocalDate result = inputDate.plusDays(n);
        System.out.println("Ngày vừa nhập cộng thêm " + n + " ngày là: " + result.format(fmt2));
    }
}
