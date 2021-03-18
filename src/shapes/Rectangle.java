package shapes;

import java.awt.geom.Point2D;

public class Rectangle extends Shape{


    public Rectangle(Point2D p0, double height, double width) {
        this.position = (Point2D) p0.clone();
        //Creates a new object of the same class and with the same contents as this object.
        this.height = height;
        this.width = width;
    }

    @Override
    public void move(double dx, double dy) {
        position.setLocation(position.getX() + dx, position.getY() + dy);
        System.out.println(movingMessage(dx,dy));
    }


    private String movingMessage(double x, double y){
        return "moving to " + x + " "+ y;
    }

    @Override
    public String doColor(){
        return this.toString();
    }
}