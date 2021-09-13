package McDonaldsBuilder;

public abstract class HotDrink extends Drink{
    public HotDrink(BeverageSize size) {
        super(size);
    }

    @Override
    public Packing packing() {
        return new SipperMug();
    }
}
