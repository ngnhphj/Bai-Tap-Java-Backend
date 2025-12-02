package Exercise_02_12_2025.Buoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiMot {

    static Scanner sc = new Scanner(System.in);
    // 1a
    public static void inputArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    // 1b
    public static void outputArray(int[] a) {
        System.out.print("Mảng: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // kt số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // 2a
    public static boolean isAllEven(int[] a) {
        for (int i : a) {
            if (i % 2 != 0)
                return false;
        }
        return true;
    }

    // 2b\
    public static boolean isAllPrime(int[] a) {
        for (int i : a) {
            if (!isPrime(i))
                return false;
        }
        return true;
    }

    // 2c
    public static boolean isAscending(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                count ++;
            }
        }
        return count == a.length-1;
    }

    // 3a
    public static int countOddElements(int[] a) {
        int count = 0;
        for (int i : a) {
            if (i % 2 != 0)
                count++;
        }
        return count;
    }

    // 3b
    public static int sumPositiveOdd(int[] a) {
        int sum = 0;
        for (int i : a) {
            if (i > 0 && i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 3c
    public static int countDivisibleBy4NotBy5(int[] a) {
        int count = 0;
        for (int i : a) {
            if (i % 4 == 0 && i % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    // 3d
    public static int sumPrimes(int[] a) {
        int sum = 0;
        for (int i : a) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // 4a
    public static int lastIndexOf(int[] a, int x) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    // 4b
    public static int firstPrimeIndex(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]))
                return i;
        }
        return -1;
    }

    // 4c
    public static int findMinPositive(int[] a) {
        int min = 10;
        for (int i : a) {
            if (i > 0 && i < min) {
                min = i;
            }
        }
        return min;
    }

    // 4d
    public static List<Integer> findElementPositions(int[] a, int k) {
        List<Integer> viTri = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                viTri.add(i);
            }
        }
        return viTri;
    }

    // 4e
    public static int findMin(int[] a) {
        int min = a[0];
        for (int i : a) {
            if (i < min)
                min = i;
        }
        return min;
    }

    // 4e
    public static int findMax(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {


        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        inputArray(a);
        outputArray(a);

        // 2
        System.out.println("2a. Mảng toàn chẵn: " + isAllEven(a));
        System.out.println("2b. Mảng toàn số nguyên tố: " + isAllPrime(a));
        System.out.println("2c. Mảng tăng dần: " + isAscending(a));

        // 3
        System.out.println("3a. Số lượng phần tử lẻ: " + countOddElements(a));
        System.out.println("3b. Tổng số dương lẻ: " + sumPositiveOdd(a));
        System.out.println("3c. Số chia hết cho 4 nhưng không chia hết cho 5: " + countDivisibleBy4NotBy5(a));
        System.out.println("3d. Tổng các số nguyên tố trong mảng: " + sumPrimes(a));


        // 4a
        System.out.print("Nhập x để tìm vị trí cuối cùng: ");
        int x = sc.nextInt();
        int lastIndex = lastIndexOf(a, x);
        System.out.println("4a. Vị trí cuối cùng của " + x + ": " + lastIndex);

        // 4b
        int firstPrimeIdx = firstPrimeIndex(a);
        System.out.println("4b. Vị trí số nguyên tố đầu tiên: " + firstPrimeIdx);

        // 4c
        int minPos = findMinPositive(a);
        if (minPos == -1) {
            System.out.println("4c. Không có số dương nào trong mảng.");
        } else {
            System.out.println("4c. Số dương nhỏ nhất: " + minPos);
        }

        // 4d
        System.out.print("Nhập k để tìm trong mảng: ");
        int k = sc.nextInt();
        List<Integer> pos = findElementPositions(a, k);
        if (pos.isEmpty()) {
            System.out.println("4d. Không tìm thấy " + k + " trong mảng.");
        } else {
            System.out.print("4d. " + k + " xuất hiện tại các vị trí: ");
            for (int index : pos) {
                System.out.print(index + " ");
            }
            System.out.println();
        }

        // 4e
        System.out.println("4e. Giá trị nhỏ nhất của mảng: " + findMin(a));
        System.out.println("4e. Giá trị lớn nhất của mảng: " + findMax(a));

        sc.close();
    }
}
