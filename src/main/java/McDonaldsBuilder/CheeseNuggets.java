package McDonaldsBuilder;

public class CheeseNuggets extends Nuggets{

    @Override
    public String name() {
        return "Сырные нагетсы";
    }

    @Override
    public int calories() {
        return 330;
    }

    @Override
    public double price() {
        return 3.8d;
    }
}
