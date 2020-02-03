
import java.util.ArrayList;
import java.util.function.Predicate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Main {
    public static void main(String[] args){
       //********************Lambda Expresions***************//
//            StrValid a = str -> str.contains("knowledge");
//            StrValid b = str -> str.length() > 10;
//            StrValid c = str -> str != null;
//            StrValid d = str -> str.trim().length() != 0;
            
            
//            boolean aX = a.valid(str);
//            boolean bX = b.valid(str);
//            boolean cX = c.valid(str);
//            boolean dX = d.valid(str);
        
           
        //*************** LAMBDA expressions with PREDICATE****************//
         Predicate<String> a1 = str -> (str.contains("knowledge")); 
         Predicate<String> a2 = str -> str.length() > 10; 
         Predicate<String> a3 = str -> str != null; 
         Predicate<String> a4 = str -> str.trim().length() != 0; 
         
         
          String str = "knowledge is power";
           
            System.out.println("The string '"  + str + "' contains the sequence 'knowledge' : " + a1.test(str));
            System.out.println("The string '"  + str + "' is greater than 10 : " + a2.test(str));
            System.out.println("The string '"  + str + "' is not null : " + a3.test(str));
            System.out.println("The string '"  + str + "' is not a string full of empty spaces : " + a4.test(str));
            
            
//            System.out.println("The string '"  + str + "' contains the sequence 'knowledge' : " + aX);
//            System.out.println("The string '"  + str + "' is greater than 10 : " + bX);
//            System.out.println("The string '"  + str + "' is not null : " + cX);
//            System.out.println("The string '"  + str + "' is not a string full of empty spaces : " + dX);
          
          
          
          
          
//        Validator a = num -> num > 0 ;
//        Validator b = num -> num < 0;
//        Validator c = num -> num == 0;
//        Validator d = num -> num % 2 == 0;
//        Validator e = num -> num % 2 != 0;
//        
//        int num = 10;
//        boolean aX = a.validate(num);
//        boolean bX = b.validate(num);
//        boolean cX = c.validate(num);
//        boolean dX = d.validate(num);
//        boolean eX = e.validate(num);
//    
//        System.out.println("Number " + num + " is greater than zero : " + aX);
//        System.out.println("Number " + num + " is less than zero : " + bX);
//        System.out.println("Number " + num + " is equal to zero : " + cX);
//        System.out.println("Number " + num + " is even : " + dX);
//        System.out.println("Number " + num + " is odd : " + eX);
    
        
    }
}
