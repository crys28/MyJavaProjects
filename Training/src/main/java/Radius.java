
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
public class Radius {
   // Scanner sc = new Scanner(System.in);
    int exponent , base;
    int integerPower(){
     int rez = 1;
            
    for(int i=0; i<exponent;i++){
          
             rez = rez*base;             
            }
    
      return rez;
            
    }
    
    
    
    
    
    
    
    
    
    /*
    double radius;
    double sphereVolume(){
       // System.out.println("Introduce the radius :");
        
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        
        return volume;
                    
     }
    */
    
}
