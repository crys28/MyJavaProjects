/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Inheritance {
     public static void main (String[] args){
         Student a = new Student("Cristi","Petru Zadnipru", "Java", 2016 , 2600);
         Staff b = new Staff("Eduard", "Jora cel Batran ", "Tekwill" , 7.50 ) ; 
         
         System.out.println(a);
         System.out.println(b);
     }
}
