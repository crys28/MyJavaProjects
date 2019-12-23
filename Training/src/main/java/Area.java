
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
public class Area {
  //  Scanner scan = new Scanner(System.in);
    
     int calculatePerimeter(int length, int width){
        int per = length * 2 + width * 2 ;
            
        return per;
     }
     
      
     int calculateArea(int length, int width){
        int ar = length * width;
     
      return ar;
     }
     
     
     /*
     int calculatePerimter(int sideLength){
         
         System.out.println("Length "+vlen);
        
         return;
     }
     */
     
     
     /*
     int calculateArea(int sideLength){
         System.out.println("Introduce the length :");
         int len2 = scan.nextInt();
         
         return len2;
     }
     */
     
}
