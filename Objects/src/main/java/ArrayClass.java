/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class ArrayClass {
    int items[];
     
    int sum=0;
    int ctr = 0;
    double avr;  
    
    
    
    
    void sum(){
    for(int i=0; i<items.length ; i++){
     sum += items[i];
        
    }System.out.println("Sum :" + sum);
    }
    
    
    
    
    
    void average(){
            
    for(int i=0; i<items.length ; i++){      
        
   //  sum += items[i];
        
     avr = sum/items.length;
      
    }      System.out.println("Average :" + avr);
    }
    
    
    
    
    
    void even(){int even = 0;
    for(int i=0; i<items.length ; i++){
     if(items[i] % 2 == 0){
     even++;
     }       
    }System.out.println("Amount of even numbers :" + even);
    }
    
    
    
    
    void odd(){ int odd = 0;
    for(int i=0; i<items.length ; i++){
     if(items[i] % 2 == 1){    
         odd++;
     }        
    }System.out.println("Amount of odd numbers :" + odd);
    }
    
    
    
    
    void length(){
        System.out.println("Length is  :" + items.length);
    }
    }
