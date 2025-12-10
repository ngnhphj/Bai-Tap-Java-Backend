package Exam;

import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);

    public static StringBuilder chuanHoa(String s){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            char b = s.charAt(i);
            if(b<='Z'&&b>='A'){
                b+=32;
            }
            result.append(b);
        }
        result.trimToSize();
        return result;
    }

    public static StringBuilder chuoiCon(String s){
        StringBuilder result = new StringBuilder();
        int start,end;
        do{
            System.out.println("Nhập vị trí bắt đầu:");
            start=Bai1.nhapSoNguyenDuong(sc);
            if(start<0||start>s.length()){
                System.out.printf("Vị trí bắt đầu phải lớn hơn 0 và bé hơn %d!\n",s.length());
            }
        }while(start<0||start>s.length());
        do{
            System.out.println("Nhập vị trí kết thúc:");
            end=Bai1.nhapSoNguyenDuong(sc);
            if(end>s.length()||end<start){
                System.out.printf("Vị trí kết thúc phải lớn hơn %d và nhỏ hơn %d!\n",start,s.length());
            }
        }while(end>s.length()||end<start);
        for(int i = start-1;i<end;i++){
            result.append(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        String  str = "TeChzen AcaDemy ";
        StringBuilder result= chuanHoa(str.trim());
        System.out.println(result);
        System.out.println(chuoiCon(str));
    }
}
