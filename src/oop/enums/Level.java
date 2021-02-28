package oop.enums;

public enum Level {

    STANDARD("Paket standard"),
    PREMIUM("Paket Premium"),
    VIP("Paket VIP");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
