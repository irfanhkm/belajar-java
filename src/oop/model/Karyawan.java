package oop.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Karyawan implements KerjaanKaryawan {
    public String name;
    public Integer nik;
    public String jabatan = "karyawan";
    public List<String> kerjaan = new ArrayList<>() {};


    public Karyawan(String name, String jabatan) {
        this(name);
        if (jabatan != null) {
            this.jabatan = jabatan;
        }
    }

    public Karyawan(String name) {
        this.name = name;
        this.generateNik();
        this.tambahKerjaanBasic();
    }

    private void generateNik() {
        nik = hashCode();
    }

    public void tambahKerjaanBasic() {
        this.kerjaan.addAll(Arrays.asList("clock in", "clock out", "kerja", "istirahat"));
    }

    public void clockIn() {
        System.out.println("anda sedang clock in");
    }

    public void clockout() {
        System.out.println("anda sedang clock out");
    }

    public void liatKerjaan() {
        System.out.println("List kerjaan " + jabatan + " :");
        System.out.println(String.join(", ", kerjaan));
    }

    @Override
    public Karyawan tambahKerjaan(String[] kerjaans) {
        this.kerjaan.addAll(Arrays.asList(kerjaans));
        return this;
    }
}
