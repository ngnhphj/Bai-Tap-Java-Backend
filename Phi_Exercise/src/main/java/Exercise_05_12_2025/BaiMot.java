package Exercise_05_12_2025;

public class BaiMot {

    public static void printArray(int[] s) {
        for (int i : s) {
            System.out.print(i + " ");
        }
    }

    public static int[] add(int[] s, int k) {
        int[] result = new int[(s.length + 1)];
        for (int i = 0; i < s.length; i++) {
            result[i] = s[i];
        }
        result[result.length - 1] = k;
        return result;
    }

    public static boolean isPrime(int x) {
        if(x<=0)
            return false;
        if (x == 1 || x == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void sapXepTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static int[] noiHaiMang(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static int[] delete(int[] a, int value) {
        int[] result = new int[0];
        for (int j : a) {
            if (j != value)
                result = add(result, j);
        }
        return result;
    }

    //a
    public static int[] TachSnt(int[] a) {
        int[] result = new int[0];
        for (int i : a) {
            if (isPrime(i))
                result = add(result, i);
        }
        return result;
    }

    //b
    public static int[] mangSoDuong(int[] a) {
        int[] result = new int[0];
        for (int i : a) {
            if (i > 0)
                result = add(result, i);
        }
        return result;
    }

    public static int[] mangSoConLai(int[] a) {
        int[] result = new int[0];
        for (int i : a) {
            if (i <= 0)
                result = add(result, i);
        }
        return result;
    }

    //c
    public static void sapXepGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    //d
    public static int[] cauD(int[] mangDuong, int[] mangConLai){
        int countNumZero = 0;
        for(int i : mangConLai){
            if(i==0)
                countNumZero ++;
        }
        mangConLai = delete(mangConLai,0);
        sapXepGiamDan(mangDuong);
        sapXepTangDan(mangConLai);
        int[] result = noiHaiMang(mangDuong,mangConLai);
        for(int i=1;i<=countNumZero;i++){
            result = add(result,0);
        }
        return result;
    }

    //e
    public static void daoMang(int[] s){
        int n = s.length;
        for(int i= 0;i<n/2;i++){
            int temp = s[i];
            s[i]=s[n-1-i];
            s[n-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] s = {37, -12, 89, -44, 0, 76, -7, -98, 52, 14};
        System.out.print("a. Tách mảng các số nguyên tố: ");
        printArray(TachSnt(s));
        System.out.println();
        System.out.println("b. Tách mảng:");
        System.out.print("   Mảng số nguyên dương:");
        printArray(mangSoDuong(s));
        System.out.print("   Mảng số còn lại:");
        printArray(mangSoConLai(s));
        System.out.println();
        System.out.print("c. Sắp xếp mảng giảm dần:");
        int[] cauC = s;
        sapXepGiamDan(cauC);
        printArray(cauC);
        System.out.println();
        System.out.println("d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0:");
        printArray(cauD(mangSoDuong(s),mangSoConLai(s)));
        System.out.println();
        System.out.print("e. Đảo mảng:");
//        printArray(s);
        int[] cauE = s;
//        printArray(cauE);
        daoMang(cauE);
        printArray(cauE);
    }
}
