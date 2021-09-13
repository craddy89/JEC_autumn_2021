package McDonaldsBuilder;

public enum BeverageSize {
    XS("Экстра маленький", 110), S("Маленький", 150), M("Средний", 210), L("Большой", 290);
    private final String name;
    private final int calories;

    BeverageSize(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}
