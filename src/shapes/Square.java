package shapes;

import java.awt.geom.Point2D;

public class Square extends Shape{

    public Square(Point2D p0, double height) {
        this.position = (Point2D) p0.clone();
        //Creates a new object of the same class and with the same contents as this object.
        this.height = this.width= height;
    }

}
