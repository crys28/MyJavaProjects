
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
public class Minutes {
         public static void main(String[] args) {         
            
             Scanner sc = new Scanner(System.in);
             
             System.out.println("Introduce the number of minutes you want to be converted : ");
             int min = sc.nextInt();
             
             int y = min / 60 / 24 / 365 ;
             int d = min / 60 / 24 ;
             int h = min / 60 ;
             int s = min * 60 ;
           //  System.out.println("Result : " + y + " " + "years" + " " + "and" + " " + d + " " + "days");
             System.out.println("Years : " + y);           
             System.out.println("Days : " + d);
             System.out.println("Hours : " + h);
             System.out.println("Seconds : " + s);
         
         }
}


   // 1 day = 1440 min
   // 1 year = 525600 min