package shapes;

import java.awt.geom.Point2D;

public abstract class Shape {
    protected Point2D position;

    protected double height;

    protected double width;

    public Shape(){}

    public String doColor(){
        return "";
    }

    public Point2D position() {
        return (Point2D) position.clone();
        //Creates a new position of the same class and with the same contents as this position object.
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void move(double dx, double dy) {
        position.setLocation(position.getX() + dx, position.getY() + dy);
    }

    public void moveTo(Point2D newPosition) {
        position.setLocation(newPosition);
    }

    public String toString() {
        return "Rectangle " + position + ", height = " + height + ", width = "
                + width;
    }
}
