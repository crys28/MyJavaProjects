
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
public class SwitchStatement {
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in);           
        
        
             //*********** TEXT MARK using IF *********//
        
        System.out.println("Insert a number from 0 to 10 :");
        int mark = sc.nextInt();
        
        if(mark >= 0 && mark <= 10){
        
        if(mark >= 0 && mark <= 4){
            System.out.println("Fail !");
        }
        if(mark == 5){
            System.out.println("Approved !");
        }
        if(mark == 6){
            System.out.println("Good !");
        }
        if(mark == 7 && mark == 8){
            System.out.println("Very good !");
        }
        if(mark == 9 && mark == 10){
            System.out.println("I'm proud of you !!!");
        }
        } else {
            System.out.println("INSERT THE CORRECT VALUE !!!");
        }
        
        
        
        
               //********* TEXT MARK using SWITCH **********//
        /*
        System.out.println("Insert a number from 0 to 10 :");
        int mark = sc.nextInt();
        
        switch (mark){
            case 0: 
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("Fail !");
            break;
            case 5: System.out.println("Approved !");
            break;
            case 6: System.out.println("Good !");
            break;
            case 7:
            case 8: System.out.println("Very good !");
            break;
            case 9:  
            case 10: System.out.println("I'm proud of you !!!");
            break;
            default : System.out.println("INSERT THE CORRECT VALUE !!!");
        }
        */         
        
        
        
        
        //*************  OPERATIONS WITH 2 NUMBERS **************//
        /*
        System.out.println("Introduce the operator :");
        String oper = sc.nextLine();       
        System.out.println("Introduce the first number :");
        int nr1 = sc.nextInt();
        System.out.println("Introduce the second number :");
        int nr2 = sc.nextInt();       
               
        switch (oper){
            case "+": System.out.println("The result is :" + nr1 + nr2); 
            break;
            case "-": System.out.println("The result is :" + (nr1 - nr2)); 
            break;
            case "*": System.out.println("The result is :" + nr1 * nr2);
            break;
            case "/": System.out.println("The result is :" + nr1 / nr2); 
            break;
            default : System.out.println("Insert an actual operator !!!");   
            break;
        }
        */
        
        
        
        
        
             //************ JAVA CLASSES PREDICT SHEDULE ************//
        
        /*
        System.out.println("Introduce the current day in this format MON/TUE/WED/THU/FRI/SAT/SUN : ");
        String day = sc.nextLine();
        
        switch (day.toUpperCase()){
            case "MON": System.out.println("You will have your classes in these next days : MON,WED,FRI");
            break;   
            case "TUE":        
            case "WED": System.out.println("You will have your classes in these next days : WED,FRI");
            break; 
            case "THU":          
            case "FRI": System.out.println("You will have your classes in these next days : FRI");
            break; 
            case "SAT":         
            case "SUN": System.out.println("No more classes this week !");
            break; 
            default : System.out.println("Input the correct value !!!");
            break;
        }
        */
        
        
        
        
        
        
                      //********* MONTH COUNTER *************//
        /*
        System.out.println("Introduce a number from 1 to 12 to see what month it is :");
        int nr = sc.nextInt();
        
        switch (nr) {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
        }
        
        if (nr < 1 || nr > 12){
            System.out.println("*ERROR* Enter numbers from 1 to 12 !!!");
        }
*/


}
}