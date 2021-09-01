package JEC_autumn2021;

public class Line implements Figure{
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(begin.getX() - end.getX(),2)+
                         Math.pow(begin.getY() - end.getY(),2));
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
               "begin=" + begin +
               ", end=" + end +
               '}';
    }
}
