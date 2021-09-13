package McDonaldsBuilder;

public abstract class Burger implements FoodItem{
    @Override
    public Packing packing() {
        return new Wrap();
    }
}
