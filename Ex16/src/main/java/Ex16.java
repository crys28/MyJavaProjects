/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Ex16 {
    public static void main(String[]  args){
    
       Point pt1 = new Point(5, 6);
       Point pt2 = new Point(5, 0);
       Point pt3 = new Point(0, 0);
       Point pt4 = new Point(0, 6);
        
        Rectangle r = new Rectangle(pt1,6,5);
        System.out.println("Initial " + r);
        r.moveUp(10);
        System.out.println("Moved up " + r);
        r.moveLeft(2);
        System.out.println("Moved left " + r);
    
    
    
    }
}
