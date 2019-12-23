
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
public class Training {
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
    
     Conversion con = new Conversion();
     
     
     System.out.print("Press 'F' for fahrenheit conversion or 'C' for celsius conversion : ");
     String val = sc.nextLine();   
     if((val.equals("F")) || (val.equals("f")) ){
               System.out.print("Input your Fahrenheit value : ");
               double f;
               f = sc.nextDouble();  
               System.out.print("Value converted in celcius : " + con.Fahrenheit(f) );
                                       
          }
     
     if((val.equals("C")) || (val.equals("c")) ){
               System.out.print("Input your Celsius value : ");
               double c;
               c = sc.nextDouble();  
               System.out.print("Value converted in fahrenheit : " + con.Celsius(c) );
                                       
          }
     
     
     
     
        
        
        
        
        
        /*
     Radius rad = new Radius();
        System.out.println("Introduce base : ");
        rad.base = sc.nextInt();
        System.out.println("Introduce exponent : ");
        rad.exponent = sc.nextInt();
        
        System.out.println("The result is : " + rad.integerPower());
    */
        
        
        
        
     /*
    Radius rad = new Radius();
        System.out.print("Introduce the radius :");
        rad.radius = sc.nextDouble();
      System.out.println("The volume is :" + rad.sphereVolume()); 
   // rad.sphereVolume();
    */
    
     
     
    } 
     
    
    
     
     
     
     
     
     
     
     
     
     
     /*
        Area calc = new Area();
     
        System.out.print("Introduce the length :");
        int len = sc.nextInt();
        
        System.out.print("Introduce the width :");
        int wid = sc.nextInt();
        
        System.out.println("The perimeter is :" + calc.calculatePerimeter(len, wid));
        System.out.println("The area is : " + calc.calculateArea(len, wid) + "cm2");
      */         
        
        
        
        
        /*
        int nr = 4;
        
        NumChecker check = new NumChecker();
        System.out.println("Number is :" + check.method(nr));
             
   }
    */
    /*
       static  boolean  method(int a){
        boolean b;
        if (a>=0){
            b=true;
        } else {
           b=false;
        }
           return b;
        
    }
    */
    
    
}
