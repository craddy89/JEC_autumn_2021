package McDonaldsBuilder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Контейнер";
    }

    @Override
    public double packingPrice() {
        return 1.25d;
    }
}
