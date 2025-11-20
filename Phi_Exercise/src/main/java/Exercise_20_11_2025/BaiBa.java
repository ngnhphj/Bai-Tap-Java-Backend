package Exercise_20_11_2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BaiBa {
    public static void main(String[] args) {
        double heSoToan, heSoLy, heSoHoa;
        double diemToan, diemLy, diemHoa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số môn Toán: ");
        heSoToan = sc.nextDouble();
        System.out.print("Nhập điểm môn Toán: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhập hệ số môn Lý: ");
        heSoLy = sc.nextDouble();
        System.out.print("Nhập điểm môn Lý: ");
        diemLy = sc.nextDouble();
        System.out.print("Nhập hệ số môn Hóa: ");
        heSoHoa = sc.nextDouble();
        System.out.print("Nhập điểm môn Hóa: ");
        diemHoa= sc.nextDouble();
        double diemTrungBinh = (diemToan*heSoToan + diemLy*heSoLy + diemHoa*heSoHoa) / (heSoToan + heSoLy + heSoHoa);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
        System.out.println("Hệ số môn Toán: " + heSoToan);
        System.out.println("Hệ số môn Lý: " + heSoLy);
        System.out.println("Hệ số môn Hóa: " + heSoHoa);
        System.out.println("Điểm trung bình: " + diemTrungBinh);


    }
}
