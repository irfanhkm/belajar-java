package basic;

public class CharStringBooleanDataType {
    public static void main(String[] args) {
        // char hanya bisa menyimpan satu karakter
        char i = 'I';
        char r = 'R';
        char f = 'F';
        char a = 'A';
        char n = 'N';
        System.out.print(i);
        System.out.print(r);
        System.out.print(f);
        System.out.print(a);
        System.out.println(n);

        // String, kumpulan karakter
        String iniString = "Irfan Hakim";
        String emptyString = "";
        String iniString2 = "Ganteng";
        System.out.println(iniString);
        System.out.println(emptyString);
        System.out.println(iniString + " " + iniString2); // concat string

        // Boolean
        boolean benar = true;
        boolean salah = false;
        System.out.println(benar);
        System.out.println(salah);
    }
}
