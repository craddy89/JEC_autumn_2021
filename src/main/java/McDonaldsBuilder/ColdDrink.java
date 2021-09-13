package McDonaldsBuilder;

public abstract class ColdDrink extends Drink{

    public ColdDrink(BeverageSize size) {
        super(size);
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
