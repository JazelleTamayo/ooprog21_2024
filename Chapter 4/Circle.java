public class Circle {
    static double radius;
    static double diameter;
    static double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * rad * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}