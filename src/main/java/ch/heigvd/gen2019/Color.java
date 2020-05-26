package ch.heigvd.gen2019;

public enum Color {
    BLUE("blue"), RED("red"), YELLOW("yellow"), NONE("no color");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
