
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Rectangle extends Polygon {
    
    Rectangle(Point topRightCorner,int width,int height){
        Point topLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY());
        Point bottomLeftCorner = new Point(topLeftCorner.getX(), topLeftCorner.getY() - height);
        Point bottomRightCorner = new Point(bottomLeftCorner.getX() + width, bottomLeftCorner.getY());
   
        vertices.add(topRightCorner);
        vertices.add(bottomRightCorner);
        vertices.add(topLeftCorner);
        vertices.add(topLeftCorner);
    }
       
}
