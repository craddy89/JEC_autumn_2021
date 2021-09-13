package McDonaldsBuilder;

public class Wrap implements Packing {

    @Override
    public String pack() {
        return "Упаковка МакДональдс";
    }

    @Override
    public double packingPrice() {
        return 0.40d;
    }
}
