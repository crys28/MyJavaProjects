
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Circle {
     Scanner sc = new Scanner(System.in);
    double radius;
    
    void raza(){
        System.out.print("Introduce the radius :");
        
        radius = sc.nextDouble();
        
        
        }
        void calculateArea(){
            
            double a = 3.14*(radius*radius);
            
            System.out.println("The area of the circle is :" +  a);
        };
        
    
}
