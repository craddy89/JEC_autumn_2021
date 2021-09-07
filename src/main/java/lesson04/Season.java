package lesson04;

public enum Season {
    Winter("Зима"), Spring(""), Summer(""), Autumn("");

    private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
