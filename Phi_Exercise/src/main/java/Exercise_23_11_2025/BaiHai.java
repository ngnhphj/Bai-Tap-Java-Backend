package Exercise_23_11_2025;

import java.util.Scanner;

public class BaiHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày:");
        int ngay = sc.nextInt();
        System.out.println("Nhập tháng:");
        int thang = sc.nextInt();
        System.out.println("Nhập năm:");
        int nam = sc.nextInt();
        System.out.printf("Bạn vừa nhập ngày %d/%d/%d.", ngay, thang, nam);
        int ktngay;
        switch (thang) {
            case 4, 6, 9, 11:
                ktngay = 30;
                break;
            case 2:
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                    ktngay = 29;
                } else {
                    ktngay = 28;
                }
                break;
            default:
                ktngay = 31;
        }
        if (ngay > ktngay || ngay < 1) {
            System.out.println("Ngày không hợp lệ");
        } else if (thang > 12 || thang < 1) {
            System.out.println("Tháng không hợp lệ");
        }
        int ngay_next = ngay + 1;
        int thang_next = thang;
        int nam_next = nam;
        if (ngay_next > ktngay) {
            ngay_next = 1;
            thang_next = thang + 1;
        }
        if (thang_next > 12) {
            thang_next = 1;
            ++nam_next;
        }

        int ngay_pre = ngay - 1;
        int thang_pre = thang;
        int nam_pre = nam;
        if (ngay_pre < 1) {
            thang_pre = thang - 1;
            switch (thang_pre) {
                case 4, 6, 9, 11:
                    ngay_pre = 30;
                    break;
                case 2:
                    if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                        ngay_pre = 29;
                    } else {
                        ngay_pre = 28;
                    }
                    break;
                default:
                    ngay_pre = 31;
            }
        }

        if (thang_pre < 1) {
            thang_pre = 12;
            --nam_pre;
        }
        System.out.printf("Ngày trước đó: %d/%d/%d.", ngay_pre, thang_pre, nam_next);
        System.out.printf("Ngày sau đó: %d/%d/%d.", ngay_next, thang_next, nam_next);
    }
}
