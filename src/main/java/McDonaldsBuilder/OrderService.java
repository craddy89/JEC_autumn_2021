package McDonaldsBuilder;

public enum OrderService {
    TAKE_AWAY("Взять с собой", 2.0d), EAT_HERE("Кушать в McDonald's", 5.5d);

    private final String name;
    private final double tax;

    OrderService(String name, double tax) {
        this.name = name;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }
}
