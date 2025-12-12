package Exam;

import java.util.Arrays;

public class Bai6 {
    public static int[] interchangeSort(int[] a){
        for(int i = 0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {12, 2, 8, 5, 1, 6, 4, 15};
        arr = interchangeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
