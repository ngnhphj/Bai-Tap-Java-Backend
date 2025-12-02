package Exercise_02_12_2025.Buoi6;

public class BaiHai {
    public static void main(String[] args) {
        String str = "12345";

        // a
        int soNguyen = Integer.parseInt(str);
        System.out.println("String -> int: " + soNguyen);

        // b
        String intToString = String.valueOf(soNguyen);
        System.out.println("int -> String: " + intToString);

        // c
        long stringToLong = Long.parseLong(str);
        System.out.println("String -> long: " + stringToLong);

        // d
        String longToString = String.valueOf(stringToLong);
        System.out.println("long -> String: " + longToString);

        // e
        String str1 = "3.14";
        float stringToFloat = Float.parseFloat(str1);
        System.out.println("String -> float: " + stringToFloat);

        // f
        String floatToString = String.valueOf(stringToFloat);
        System.out.println("float -> String: " + floatToString);

        // g
        String str2 = "2.71828";
        double stringToDouble = Double.parseDouble(str2);
        System.out.println("String -> double: " + stringToDouble);

        // h
        String doubleToString = String.valueOf(stringToDouble);
        System.out.println("double -> String: " + doubleToString);

        // i
        String str3 = "123";
        short stringToShort = Short.parseShort(str3);
        System.out.println("String -> short: " + stringToShort);

        // k
        String shortToString = String.valueOf(stringToShort);
        System.out.println("short -> String: " + shortToString);
    }
}

