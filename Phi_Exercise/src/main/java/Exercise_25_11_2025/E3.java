package day_04.exe;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while (n < 0);
        //in dãy giá trị chẵn xen kẽ dương âm mỗi 3 số: 2, 4, -6, 8, 10, --12,..., n

        //cách 1:khiểm tra đk chia hết cho 6
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i % 6 == 0) {
                    System.out.print((-i) + " ");
                } else System.out.print(i + " ");
            }
        }

        System.out.println();
        //cách 2:khai báo biến distance lưu khoảng cách cố định là 3, mỗi 3 lần duyệt thì in -i
        int distance = 3;
        int count = 1;
        for(int i=2;i<=n;i+=2)
        {
            if(count == distance){
                System.out.print((-i) + " ");
                count = 0;
            }
            else {
                System.out.print(i + " ");
            }
            count ++;
        }

    }
}
