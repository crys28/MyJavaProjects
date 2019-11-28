/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

/**
 *
 * @author crys_
 */
public class Ex_4_2 {
         public static void main(String[] args) {
          /*
             int a = 10 ;
             double b = 20.3 ; 
             double c = 3.14785 ;
             boolean tf = true ;
             
             String name = "Iacomachi" ;
             String surname = "Cristian" ;
             String message ;
             message = "My" + " " + "name" + " " + "is" + " " + name + " " + surname + "!" ;
             
             long L = 1200305252520L;
             float F = 28.02f;
             String message2 = "Long variable =" + " " + L + " " + ";" + " " + "Float variable =" + " " + F ;
             
             int number = (int) L;
             double number2 = F;
          */
             double price = 50.50;
             double tax = 15.30;
             int quantity = 8;
             double total ;
             
             total = price * quantity * tax ;
             String message3 = "I want to buy" + " " + quantity + " " + "of these";
             String message4 = "Total cost with tax is" + " " + total + " " + "$" ;
          
          /*
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(tf);
            System.out.println(message);     
            System.out.println(message2);
            System.out.println(number + " " + ";" + " " + number2);
           */ 
            System.out.println(message3);
            System.out.println(message4);
     }
}
