package basic;

public class Variable {
    public static void main(String[] args) {
        // variable tempat utk menyimpan data
        // java menggunakan static type, menyimpan tipe data yang sama dan tidak bisa berubah-ubah tipe data
        // penulisan variable, tipeDate namaVariable
        // nama variable tidak boleh mengandung whitespace, tidak boleh semuanya number

        String name; // tanpa init value
        name = "Irfan Hakim";

        int age = 20; // menggunakan init value
        String city = "Malang";

        System.out.println(name + " berumur: " + age + " beralamatkan di " + city);

        // Tipe data var
        // bisa membuat variable tanpa menyebutkan tipe data
        // harus menginit value terlebih dahulu

        // var pinalti; Error! tidak ada pelanggaran, harus diinit valuenya dulu
        var iniVar = "bola mengenai tangan";

        // Tipe data final
        // sama seperti const di php, variable dengan kata kunci final tidak dapat diubah
        // penulisan diawali dengan final diikuti dengan tipe data dan nama variable

        final String keputusanHakim = "Bersalah";
        // keputusanHakim = "Tidak Bersalah" // Error ! keputusan hakim tidak dapat diubah karena bersifat final
    }
}
