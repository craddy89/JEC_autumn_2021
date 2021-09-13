package McDonaldsBuilder;

public class SipperMug implements Packing {

    @Override
    public String pack() {
        return "Кружка Sipper";
    }

    @Override
    public double packingPrice() {
        return 1.6d;
    }
}
