package Exercise_20_11_2025;

import java.util.Scanner;

public class BaiHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TenSP;
        int SL;
        float DonGia;
        System.out.println("Nhập tên sản phẩm: ");
        TenSP = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        SL = sc.nextInt();
        System.out.println("Nhập đơn giá: ");
        DonGia = sc.nextFloat();
        float TienHang = SL * DonGia;
        double VAT = TienHang * 0.1;
        double TongTien = TienHang + VAT;
        System.out.println("Tên sản phẩm: " + TenSP);
        System.out.println("Số lượng: " + SL);
        System.out.println("Đơn giá: " + DonGia);
        System.out.println("Tiền hàng: " + TienHang);
        System.out.println("VAT: " + VAT);
        System.out.println("Tổng tiền phải trả: " + TongTien);

    }
}
