
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
public class EquationSolver {
    public static void main(String[] args) {         
       
        Scanner math = new Scanner(System.in);
        
        System.out.println("Introduce the numbers for your quadratic equation :");
        System.out.print("a =");
        double a = math.nextDouble();
        System.out.print("b =");
        double b = math.nextDouble();
        System.out.print("c =");
        double c = math.nextDouble();
        
        double x1 , x2 ;
        
        double det = b*b-4*a*c;
         
        if(det > 0){
        
             x1= (-b+Math.sqrt(det))/(2*a);
             x2= (-b-Math.sqrt(det))/(2*a);
             
             System.out.println("x1=" + x1 + " " + ";" + " " + "x2=" + x2);
      
        }
        
        
        
        
}
}