package basic;

public class PrimitiveDataType {
    public static void main(String[] args) {
        // Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
        // Tipe data primitif selalu memiliki default value
        // Tipe data bukan primitif tidak memiliki default dan bisa bernilai null

        // Tipe data primitif || Tipe data bukan primitif
        // byte               || Byte
        // short              || Short
        // int                || Integer
        // long               || Long
        // float              || Float
        // double             || Double
        // char               || Char
        // boolean            || Boolean

        Short shortVar; // NULL
        // short shortVar; // Error ! harus diinit valuenya

        // konversi primitif ke bukan primitif (satu tipe tipe data)
        int iniInt = 100;
        Integer iniInt2 = iniInt;

        // konversi primitif ke bukan primitif (beda tipe data)
        short jadiShort = iniInt2.shortValue();
        long jadiLong = iniInt2.longValue();
        float jadiFloat = iniInt2.floatValue();

    }
}
