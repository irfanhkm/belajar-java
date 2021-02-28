package oop.model;

public class Backend extends Karyawan {
    public Backend(String name) {
        super(name, "Backend");
        this.tambahKerjaan(new String[]{
                "Bikin Database", "Setup Project", "Meeting dengan client"
        });
    }
}
