package shapes;
import java.awt.Color;

public class ShapeDecorator extends Shape{
    protected Shape mshape;

    public ShapeDecorator(Shape shape){
        mshape=shape;
    }

    public Shape getShape(){
        return  mshape;
    }

    public void setShape(Shape mshape){
        this.mshape=mshape;
    }
}
