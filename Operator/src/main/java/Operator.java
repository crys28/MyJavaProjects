
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
public class Operator {
        public static void main(String[] args) {         
        
          Scanner sc = new Scanner(System.in);
            System.out.println("Insert your first number : ");
            int nr1 = sc.nextInt();
            
            System.out.println("Insert your second number : ");
            int nr2 = sc.nextInt();
            
            int sum = nr1 + nr2 ;
            int dif = nr1 - nr2 ;
            int mul = nr1 * nr2 ;
            double div = nr1 / nr2 ;
            double avr = (nr1 + nr2) / 2 ;
            double rest = nr1 % nr2 ;
             
            System.out.println("Addition : " + sum);
            System.out.println("Substraction : " + dif);
            System.out.println("Multiplicaton : " + mul);
            System.out.println("Division : " + div);
            System.out.println("Average : " + avr);
            System.out.println("Remainder : " + rest);
            
                   
            
        }
}
