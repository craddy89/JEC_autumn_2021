package McDonaldsBuilder;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Веганский Бургер";
    }

    @Override
    public int calories() {
        return 150;
    }

    @Override
    public double price() {
        return 2.7d;
    }
}
