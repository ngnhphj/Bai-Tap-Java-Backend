package Exercise_02_12_2025.Buoi6;

public class BaiBon {
    public static void main(String[] args) {
        // a
        String str = "Hello World";
        StringBuffer sbf = new StringBuffer(str);
        StringBuilder sbd = new StringBuilder(str);
        String worldFromSbf = sbf.substring(6); // từ index 6
        String worldFromSbd = sbd.substring(6);
        System.out.println("a) StringBuffer -> " + worldFromSbf);
        System.out.println("   StringBuilder -> " + worldFromSbd);

        // b
        String replacedBySbf = sbf.toString().replace('o', 'f');
        String replacedBySbd = sbd.toString().replace('o', 'f');
        System.out.println("b) Thay 'o' thành 'f' (StringBuffer): " + replacedBySbf);
        System.out.println("   Thay 'o' thành 'f' (StringBuilder): " + replacedBySbd);

        // c
        String hello = "Hello";
        String world = "World";
        String s = hello + " " + world;
        System.out.println("c) String: " + s);

        StringBuffer sbf2 = new StringBuffer(hello);
        sbf2.append(" ");
        sbf2.append(world);
        System.out.println("   StringBuffer: " + sbf2.toString());

        StringBuilder sbd2 = new StringBuilder(hello);
        sbd2.append(" ");
        sbd2.append(world);
        System.out.println("   StringBuilder: " + sbd2.toString());
    }
}

