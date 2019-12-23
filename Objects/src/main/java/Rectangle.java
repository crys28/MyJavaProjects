/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Rectangle {
   
    int length;
    int width;
    
    void calculateArea(){
        System.out.println("Area of rectangle is : " + (length * width));       
    }
    
    void calculatePermiter(){
        System.out.println("Perimeter of rectangle is : " + (2 * (length + width)));
    }
    
}
