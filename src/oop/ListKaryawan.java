package oop;

import java.util.ArrayList;
import java.util.List;

public class ListKaryawan {
    public static void main(String[] args) {
        String[][] listKaryawan = {
                {"Irfan Hakim", "Backend"},
                {"Sugiman", "Frontend"},
                {"Bibi", null},
        };

        List<Karyawan> objectKaryawans = new ArrayList<Karyawan>();
        for (var data: listKaryawan) {
            objectKaryawans.add(new Karyawan(data[0], data[1]));
        }

        objectKaryawans.forEach((karyawan) -> {
            System.out.println("====");
            System.out.println("NIK = " + karyawan.nik);
            System.out.println("Nama = " + karyawan.name);
            System.out.println("Jabatan = " + karyawan.jabatan);
            System.out.println("====");
        });
    }
}
