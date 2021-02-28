package oop;

import oop.model.Karyawan;
import oop.model.Backend;

import java.util.ArrayList;
import java.util.List;

public class ListKaryawan {
    public static void main(String[] args) {
        listKaryawan();
        System.out.println("=====");
        listKaryawanInheritance();
        anonymousClass();
    }

    protected static void listKaryawan() {
        String[][] listKaryawan = {
                {"Irfan Hakim", "Backend"},
                {"Sugiman", "Frontend"},
                {"Bibi", null},
        };

        List<Karyawan> objectKaryawans = new ArrayList<>();
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

    protected static void listKaryawanInheritance() {
        Backend backend = new Backend("Irfan");
        backend.tambahKerjaan(new String[] {
                "Beli makan siang bos"
        }).liatKerjaan();

        Karyawan karyawan = new Karyawan("Irfan");
        karyawan.liatKerjaan();
    }

    protected static void anonymousClass() {
        AnonClass indo = () -> System.out.println("ListKaryawan.sayHello");
        indo.sayHello();
    }
}
