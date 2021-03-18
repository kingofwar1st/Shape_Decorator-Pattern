package shapes;

import java.awt.*;

public class Background extends ShapeDecorator{

    public Background(Shape shape){
        super(shape);
    }

    @Override
    public String doColor(){
        String type = mshape.doColor();
        return type + paintBackground();
    }


    private String paintBackground(){
        Color bfg = new Color(255, 255, 0);
        return  ", "+ bfg;
    }
}
