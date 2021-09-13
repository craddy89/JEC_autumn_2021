package McDonaldsBuilder;

public class ChickenBurger extends Burger{


    @Override
    public String name() {
        return "Чикен Бургер";
    }

    @Override
    public int calories() {
        return 350;
    }

    @Override
    public double price() {
        return 4.5d;
    }
}
