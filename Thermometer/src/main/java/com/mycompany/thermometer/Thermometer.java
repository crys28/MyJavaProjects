/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author crys_
 */
public class Thermometer {
     public static void main(String[] args) {         
        
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Choose what you want to convert by pressing 1 (for Farhenheit) or 2 (for Celcius) : ");
          int val = sc.nextInt();
          double f , c ;
              
              
        
        if(val == 1){
               System.out.println("Input your Fahrenheit value : ");
               f = sc.nextDouble();  
               c = (5*(f-32))/9 ; 
               System.out.println("Converted to Celsius : " + c);                
          }
          
          if(val == 2){
               System.out.println("Input your Celsius value : ");
               c = sc.nextDouble(); 
               f = (9*c+(32*5))/5 ; 
               System.out.println("Converted to Fahrenheit: " + f);               
          }
          
          
          
          
          
          
          /*
          System.out.println("Input your Fahrenheit value : ");
          double F = sc.nextDouble();
          double C ;
        
          C = (5*(F-32))/9 ;
        
         
          
          System.out.println("Converted to Celsius : " + C);
          */    
     
     }
}