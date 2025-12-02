package Exercise_02_12_2025.Buoi6;

import java.util.Scanner;

public class BaiMot {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Chuỗi gốc: " + str);

        // a
        String str1 = str.substring(6);
        System.out.println("a. World: " + str1);

        // b
        String str2 = str.replace('o', 'f');
        System.out.println("b. Thay 'o' thành 'f': " + str2);

        // c
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("c. Số lượng 'l': " + count);

        // d
        int first = str.indexOf('l');
        int last = str.lastIndexOf('l');
        System.out.println("d. Vị trí 'l' đầu tiên: " + first);
        System.out.println("   Vị trí 'l' cuối cùng: " + last);

        // e
        String str3 = str.replace(" ", "");
        System.out.println("e. Xóa hết space: " + str3);

        // f
        String str4 = str.trim();
        System.out.println("f. trim(): '" + str4 + "'");

        // g
        String str5 = new StringBuilder(str).reverse().toString();
        System.out.println("g. Đảo chuỗi: " + str5);

        // h
        String strSQC = "SQC";
        String strPlus = strSQC + " " + str;
        System.out.println("h. Nối SQC và Hello World: " + strPlus);

        // i
        String str6 = strPlus.toUpperCase();
        System.out.println("i. Viết hoa: " + str6);

        // k
        String str7 = strPlus.toLowerCase();
        System.out.println("k. Viết thường: " + str7);

        // l
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuỗi S hiện tại: " + strPlus);
        System.out.print("Nhập vị trí bắt đầu: ");
        int n = sc.nextInt();
        System.out.print("Nhập vị trí kết thúc: ");
        int m = sc.nextInt();

        if (n >= 0 && m <= strPlus.length() && n < m) {
            String sub = strPlus.substring(n, m+1 );
            System.out.println("l. Chuỗi con từ vị trí " + n + " đến " + m + " là: " + sub);
        } else {
            System.out.println("l. n, m không hợp lệ!");
        }

    }
}

