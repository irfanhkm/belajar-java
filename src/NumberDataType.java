public class NumberDataType {
    public static void main(String[] args) {
        // absolute variable
        byte Byte = 100;
        short Short = 10000;
        int Integer = 100000000;
        long Long = 1000000000;

        // floating point variable
        float Float = 1.5F;
        double Double = 1.5;

        // Literals number
        int decimalInt = 25;
        int hexInt = 0xA; // 10
        int binInt = 0b00011; // 3

        // Underscore pada angka
        long underScoreLong = 1_000_000; // 1000000

        // widening casting (byte -> short -> int -> long -> float -> double) = konversi dilakukan otomatis
        byte byte1 = 10;
        short short1 = byte1;
        int int1 = short1;
        int long1 = int1;
        int float1 = long1;
        int double1 = float1;

        // int double1 = (short) (byte) 10; best practice konversinya

        // narrowing casting (double -> float -> long -> int -> short -> byte) = konversi dilakukan manual
        float float2 = (float) double1;
        long long2 = (long) float2;
        int int2 = (int) long2;
        short short2 = (short) int2;
        byte byte2 = (byte) short2;
    }
}
