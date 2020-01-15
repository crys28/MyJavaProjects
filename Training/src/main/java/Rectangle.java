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
    int length , width ;
    
    void Area(){
        
        System.out.println("The area is : " + (length * width));
    
    }
    
    Rectangle(){
    this(0);
    }
    
    Rectangle(int len , int wid){
    this.length = len;
    this.width = wid;
    }
    
    Rectangle(int one){
    this(one,one);
    }
    
    
}
