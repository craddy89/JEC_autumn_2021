package McDonaldsBuilder;

public abstract class Nuggets implements FoodItem{
    @Override
    public Packing packing() {
        return new Container();
    }
}
