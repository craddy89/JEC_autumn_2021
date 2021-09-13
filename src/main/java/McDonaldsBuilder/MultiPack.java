package McDonaldsBuilder;

public class MultiPack implements Packing {

    private final double packingPrice;

    public MultiPack(double packingPrice) {
        super();
        this.packingPrice = packingPrice;
    }

    @Override
    public String pack() {
        return "Multi-Pack";
    }

    @Override
    public double packingPrice() {
        return packingPrice;
    }
}
