/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Circle implements Movable {
    
    Point point;
    int radius;
    
    Circle(Point center, int radius){
    this.point = center;
    this.radius = radius; 
    }
    
    @Override
    public void moveUp(int distance){     
        point.setY(point.getY() + distance);
    };
    
    @Override
    public  void moveDown(int distance){
        point.setY(point.getY() - distance);
    };
    
    @Override
    public  void moveLeft(int distance){
        point.setX(point.getX() - distance);
    };
    
    @Override
    public  void moveRight(int distance){
        point.setX(point.getX() + distance);
    };
    
    
    
    @Override
    public String toString(){
    return "" ;
    }
    
    
}
