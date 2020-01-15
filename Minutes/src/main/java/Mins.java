
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
public class Mins {
   Scanner sc = new Scanner(System.in);
   int min,y,d,h,s;
   
   void Introducer(){
     min = sc.nextInt();
    }
    
   void Calculates(){
             y = min / 60 / 24 / 365 ;
             d = min / 60 / 24 ;
             h = min / 60 ;
             s = min * 60 ;
   }
   
    void Show1(){
        Mins a = new Mins();
        a.Calculates();
             System.out.println("Years : " + y);           
             
    }
    
     void Show2(){
             Mins a = new Mins();
        a.Calculates();           
             System.out.println("Days : " + d);
    }
     
      void Show3(){
              Mins a = new Mins();
        a.Calculates();              
             System.out.println("Hours : " + h);
            
    }
      
       void Show4(){
      Mins a = new Mins();
        a.Calculates();
             System.out.println("Seconds : " + s);
    }
       
  
    
            
       //      System.out.println("Introduce the number of minutes you want to be converted : ");
             
             
            
          
             
}
