package ch.heigvd.gen2019;

public enum Size {
    XS("XS"), S("S"), M("M"), L("L"), XL("XL"), XXL("XXL"), NONE("no size");

    private final String name;

    Size(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
