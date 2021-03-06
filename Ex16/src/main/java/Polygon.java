
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public abstract class Polygon implements Movable{
   
    protected List<Point> vertices = new ArrayList<>();
      
    
     @Override
    public void moveUp(int distance) {
        for (Point point : vertices){
        point.setY(point.getY() + distance);
        }
    }

    @Override
    public void moveDown(int distance) {
    for (Point point : vertices){
        point.setY(point.getY() - distance);
        }
    }

    @Override
    public void moveLeft(int distance) {
    for (Point point : vertices){
        point.setX(point.getX() - distance);
        }
    }

    @Override
    public void moveRight(int distance) {
    for (Point point : vertices){
        point.setX(point.getX() + distance);
        }
    }
    
    @Override
   public String toString() {
   return getClass().getName() + " " + Arrays.toString(vertices.toArray());
   }
}
