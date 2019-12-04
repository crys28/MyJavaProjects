
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
public class ForLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);       
    
        System.out.println("Input a positive number :");
        int n = sc.nextInt();
        
        if (n < 0){System.out.println("ERROR");
        } else {        
        
        System.out.println("Ascending :");
           
        for (int ctr = 1 ; ctr < n ; ctr++ ){           
           System.out.print(ctr + " ");                                            
        } 
        
       System.out.println("");
       System.out.println("");
       System.out.println("Descending :");
         
        for (int ctr2 = --n ; ctr2 > 0 ; ctr2-- ){
            System.out.print(ctr2 + " ");
        }     
      }
    
        //******** SHOWS THE NUMBERS DIVISIBILE BY 2 **********//
        
        /*
       System.out.println("Input a positive number :");
        int n = sc.nextInt();
        
        if (n < 0){System.out.println("ERROR");
        } else {        
        
        System.out.println("Ascending :");
           
        for (int ctr = 1 ; ctr < n ; ctr++ ){
            
            if(ctr %2 == 0){System.out.print(ctr + " ");
             }                                
        } 
       System.out.println("");
       System.out.println("");
       System.out.println("Descending :");
         
        for (int ctr2 = --n ; ctr2 > 0 ; ctr2-- ){
            if(ctr2 %2 == 0){System.out.print(ctr2 + " ");
          
        }     
      }
    } 
    */    
        
  
  }
}