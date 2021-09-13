package McDonaldsBuilder;

public class Container implements Packing {
    @Override
    public String pack() {
        return "Контейнер";
    }

    @Override
    public double packingPrice() {
        return 1.25d;
    }
}
