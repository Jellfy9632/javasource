package extend;

public class Triangle extends Shape {
    // Point point1;
    // Point point2;
    // Point point3;

    Point[] point;

    public Triangle(Point[] point) {
        this.point = point;
    }

    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s , color = %s\n", point[0].getXY(), point[1].getXY(),
                point.getClass(), color);
    }

}
