
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
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
    
     
     
     String a = "Jan 1,2020" ; 
     
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d,YYYY" , Locale.US);
     
     LocalDate date = LocalDate.parse(a, formatter );
       
        System.out.println(date);
     
       
    //  System.out.println(date.format(formatter.withLocale(Locale.US)));
       // System.out.println(date.format(formatter,));
     
     
     
     
     
//     LocalDateTime dt = LocalDateTime.now();
//     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");
//     
//     System.out.println(dt.format(formatter));
//        System.out.println(formatter.format(dt));
//     



//      LocalTime time1 = LocalTime.now();
//      System.out.println(time1.plusHours(2));  
     
                       
         
//         LocalDate dateA = LocalDate.of(2000, Month.FEBRUARY, 28);
//         LocalDate dateB = LocalDate.of(2003, Month.JUNE, 16);
//         
//         Period per = Period.of(dateA.getYear(), dateA.getMonthValue(), dateA.getDayOfMonth());
//         System.out.println(dateB.minus(per)); 
//         System.out.println(Period.between(dateA, dateB));
         
      /*****************************************************************/
                            /*** AGE CALCULATOR ***/


        
       
//            LocalDate y = LocalDate.now();
//             DateTimeFormatter form = DateTimeFormatter.ofPattern("YY");
//
//             System.out.print("Day of birth : ");
//             int d = sc.nextInt();
//              System.out.print("Month of birth : ");
//             int m = sc.nextInt();
//             System.out.print("Year of birth : ");
//             int ye = sc.nextInt();
//
//               Period a = Period.of(ye, m, d);
//               System.out.println("");
//               System.out.println("Your age is : " + y.minus(a).format(form));
       
            
        /***************************************************************/    
        //   LocalDate scan = LocalDate.of(ye, m, d);
          // System.out.println(y.format(form));
        // System.out.println("Your age is : " + Period.between(scan, y));
         
         
         
         
         
        
        
         





         
//     StringBuilder str = new StringBuilder("Hello");
//     str.append(" World");
//     
//        System.out.println(str);
//     
//     StringBuilder str2= new StringBuilder("moon#bight");
//     int a = str2.indexOf("#");
//     int b = str2.charAt(a-1); //a-- => a = a-1
//     int c = str2.charAt(a+1);
//     
//     System.out.println(b==c);
         
    //StringBuilder str3 = new StringBuilder("welcome");
    
    
    
    
//    String str3 = "welcome";
//    
//   // char ch[] = str3.toCharArray();
//   // char ch2[] = new char[str3.length() * 2];
//    StringBuilder sb = new StringBuilder("welcome");
//    
//    for(int i=0; i<=sb.length();i++){     
//        sb.append(i).append(i);
//     
//    }
//     System.out.println(sb);
//       
    
         
     
   
     
     
     
     
     
     
     
     
     
     
     
     
  
//     String str1 = "Tokyo Bucharest Shangai Praga";
//     String str2 = "Praga Viena Paris Tokyo";
     
        //  System.out.println(str1["Tokyo"] == str2["Tokyo"]?true : false);
        
       
     
     
     
     
     
     
//     String a = "The quick brown fox jumps over the lazy dog";
//     
//        System.out.println(a.replace("d","f"));
//        System.out.println(a.toLowerCase());
//     
//     
//     String b = "   Java Exercises     ";
//        
//        System.out.println(b.trim());
     
     
     
     
     
     
     
     
     
     
      // Holiday a = new Holiday("Christmas / ",25," / December");
     
     /*
     String a = "Let's go home,it's late already";
     String b = "Let's go home,it's late alread" ;  
     
        System.out.println(a.charAt(6));
        System.out.println(a.charAt(10));
        System.out.println(" ");
        System.out.println(a.contains(b)); 
     System.out.println(" ");
        System.out.println(a.endsWith("y"));
     System.out.println(" ");
        System.out.println(a.equals(b));
     System.out.println(" ");
        System.out.println(a.compareTo(b));
      */  
     
     
     
     /*
     Rectangle r1 = new Rectangle();
     Rectangle r2 = new Rectangle(4,5);
     Rectangle r3 = new Rectangle(3);
     
     r1.Area();
     r2.Area();
     r3.Area();
     */
     
     
     
     
     
     
     
     
     /*
     Student a = new Student("Nicu");
     a.print();
     Student b = new Student();
    b.print();
   */
   
     
     
     
     
     
     
     
     
     
     
     
     
     /*
     Counting a = new Counting();
     Counting b = new Counting();
     Counting c = new Counting();
     Counting d = new Counting();
     
     d.Print();
     */
    
     
     
     
     
     
     
     /*
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
     */
     
     
     
        
        
        
        
        
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
}
