package McDonaldsBuilder;

public class ChickenNuggets extends Nuggets{
    @Override
    public String name() {
        return "Куриные нагетсы";
    }

    @Override
    public int calories() {
        return 450;
    }

    @Override
    public double price() {
        return 5.0d;
    }
}
