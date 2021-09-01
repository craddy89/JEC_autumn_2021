package JEC_autumn2021;

public class ProgramOOP {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        int newValueForX = 2;
        p1.setX(newValueForX);
        System.out.println(p1);
        ColorPoint cp1 = new ColorPoint(2, 2, "red");
        Point p2 = new Point(3, 3);
        Point p3 = new Point(4, 4);
        Line l1 = new Line(p2, p3);
        ColorLine cl1 = new ColorLine(p2, p3, "blue");
        Triangle triangle1 = new Triangle(p1, p2, p3);

        Figure[] masObj = new Figure[6];
        masObj[0] = p1;
        masObj[1] = cp1;
        masObj[2] = l1;
        masObj[3] = cl1;
        masObj[4] = triangle1;
        for (var obj : masObj) {
            System.out.println(obj);
            if (obj instanceof Triangle tr) {
                System.out.println(tr.getLengthAB());
            }
        }
    }
}

