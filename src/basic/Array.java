package basic;

public class Array {
    public static void main(String[] args) {
        // array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        // jumlah data di array tidak bisa berubah setelah pertama kali dibuat

        // cara kerja array
        // Index: 0 1 2 3 4 5
        // Array Length: 6

        // Cara 1
        // Diawali dengan tipe data, diikuti dengan symbol [], dan nama variable
        String[] arrayString;
        arrayString = new String[2];
        arrayString[0] = "Irfan";
        arrayString[1] = "Hakim";
        System.out.println(arrayString[0]);

        // Cara 2
        // Diawali dengan tipe data, diikuti dengan symbol [], nama variable, dan new init variablenya
        String[] arrayString2 = new String[] {
                "Budi", "Hakim"
        };

        String[] arrayString3 = {
                "Irfan", "Hakim"
        };

        // Array operation
        // array[index] // mengambil data di array
        // array[index] = value // mengubah data
        // array.length // mengetahui panjang array
        arrayString2[0] = "Irfan";
        System.out.println(arrayString2[0]);
        System.out.println(arrayString2.length);

        // Multidimensi array
        String[][] multiArray = {
                {"Irfan", "Hakim"},
                {"Joko", "Suprobo"},
        };

        System.out.print(multiArray[0][0]); // Irfan
        System.out.print(" " + multiArray[1][1]); // Suprobo
    }
}
