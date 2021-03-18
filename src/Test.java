import shapes.Background;
import shapes.Foreground;
import shapes.Rectangle;
import shapes.Shape;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape> myList = new ArrayList<>();

        Rectangle r = new Rectangle(new Point2D.Double(10,10), 5, 5);
        Point2D p = r.position();
        p.setLocation(20, 20);

        r.move(20,20);
//
        Foreground foreground = new Foreground(r);
//        System.out.println(foreground.doColor());

        Background background = new Background(foreground);
        System.out.println(background.doColor());


    }
}
