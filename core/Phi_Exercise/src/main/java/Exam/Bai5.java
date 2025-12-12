package Exam;

import java.util.Arrays;

public class Bai5 {
    public static boolean ktrSoNguyenTo(int x){
        if(x==1)
            return false;
        for(int i = 2;i<=Math.sqrt(x);i++){
            if(x%i==0)
                return false;
        }
        return true;
    }

    public static void timSoNguyenTo(int[] a){
        System.out.print("Các số nguyên tố trong mảng là: ");
        System.out.print("[");
        for(int i : a){
            if(ktrSoNguyenTo(i)){
                System.out.print(i + " ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 23, 8, 47, 10, 3};
        Bai6.interchangeSort(arr);
        timSoNguyenTo(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
