package shapes;

import java.awt.*;

public class Foreground extends ShapeDecorator{

    public Foreground(Shape shape){
        super(shape);
    }

    @Override
    public String doColor(){
        String type = mshape.doColor();
        return type + paintForeground();
    }


    private String paintForeground(){
        Color cfg = new Color(255, 0, 0);
        return ", colors = " +cfg;
    }
}
