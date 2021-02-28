package oop;

import java.util.Random;

public class Karyawan {
    String name;
    Integer nik;
    String jabatan = "karyawan";

    Karyawan(String name, String jabatan) {
        this(name);
        if (jabatan != null) {
            this.jabatan = jabatan;
        }
    }

    Karyawan(String name) {
        this();
        this.name = name;
    }

    public Karyawan() {
        this.generateNik();
    }

    Integer generateNik() {
        Random rand = new Random();
        nik = rand.nextInt(1000);
        return nik;
    }
}
