package Exam;

public class Bai3 {
    public static void hinhChuNhatRong(){
        for(int i = 0; i< 10;i++){
            for(int j=0;j<10;j++){
                if(i==0||i==9||j==0||j==9){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void tamGiacCan(){
//        for(int i = 0;i<7;i++){
//            for(int j=0;j<7-i+1)
//        }
    }

    public static void main(String[] args) {
        hinhChuNhatRong();
    }
}
