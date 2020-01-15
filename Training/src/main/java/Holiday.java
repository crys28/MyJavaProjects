/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Holiday {
     private String name;
     private int day;
     private String month;
     
     Holiday(String n,int d,String m){
      n = name;
      d = day;
      m = month;
     }
     
     Boolean inSameMonth(){
     if(this.month == this.month){
     return true;
     } else {
     return false;
     }
     }
     
     double avgDate(int Holiday[]){
     int sum;
     double avr=0;
          for(int i=0;i<=Holiday.length;i++){
          sum = day +i;
          avr = sum/Holiday.length ;
              }
         return avr;
     }
     
     void show(){
         
     }
     
}
