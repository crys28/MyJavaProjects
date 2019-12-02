
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


public class Constructor {
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in);              
      /*
        System.out.println("Introduce a number :");
        float nr = sc.nextFloat();
        
        if (nr >= 0){
            System.out.println("The number is positive !");
        } else {
        if (nr < 0){
            System.out.println("The number is negative");  
        }
               }

               */



        
      
        System.out.println("Introduce the first number : ");
        int nr1 = sc.nextInt();
        
        System.out.println("Introduce the second number : ");
        int nr2 = sc.nextInt();
        
        System.out.println("Introduce the third number :");
        int nr3 = sc.nextInt();
        
           if (nr1 >= nr2 && nr1 >= nr3 ){
               System.out.println("The biggest number is :" + nr1);
           }
           
           if (nr2 >= nr1 && nr2 >= nr3){         
               System.out.println("The biggest number is :" + nr2);           
           }
           if (nr3 >= nr1 && nr3 >= nr2){     
               System.out.println("The biggest number is :" + nr3);
           }
           
         
        
        
        
        
        
        /*
        if (nr1 >= nr2){
         if ( nr1 >= nr3){
             System.out.println("The biggest number is :" + nr1);
         }
        } else {
           if (nr2 >= nr1) {
           if (nr2 >= nr3){
               System.out.println("The biggest number is :" + nr2);
           }
           }else {
           if (nr3 >= nr1){
           if (nr3 >= nr2){
               System.out.println("The biggest number is :" + nr3);
           }
           }
           }
        }
         */
      
        
     /**********************************/  
     /*   /*                             /*
     /   boolean t = true;              /*   
     /   boolean f = false;             /*
     /                                  /*
     /   if(nr1 == nr2){                /*
     /     System.out.println(t);       /*
     /   } else {                       /*
     /      System.out.println(f);      /*
     /   }                              /*
    */                                 /*
     /**********************************/   
        
    }
}
