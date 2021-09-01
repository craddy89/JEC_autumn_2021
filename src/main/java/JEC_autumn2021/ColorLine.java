package JEC_autumn2021;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point begin, Point end, String color) {
        super(begin, end);
        this.color = color;
    }

    public ColorLine(Line l1, String green) {
        super(l1.getBegin(), l1.getEnd());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
               "color='" + color + '\'' +
               '}';
    }
}
