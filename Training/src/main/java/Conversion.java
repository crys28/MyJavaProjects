/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Conversion {
    
    double Fahrenheit(double fah){
        double cel;
        cel = (5*(fah-32))/9 ; 
        
        return cel;
    }
    
    double Celsius(double cel){
        double fah;
        fah = (9*cel+(32*5))/5 ; 
        
        return fah;
    }
     
    
    
}
