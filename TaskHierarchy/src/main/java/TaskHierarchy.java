
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class TaskHierarchy {
    public static void main(String[] args){
    
         ArrayList <Task> myarr = new ArrayList<>();
         
         OutTask a = new OutTask("EXECUTION");                 
         RandomOutTask b = new RandomOutTask();              
         CounterOutTask c = new CounterOutTask();
         CounterOutTask d = new CounterOutTask();
       
         myarr.add(a);
         myarr.add(b);
         myarr.add(c);
         myarr.add(d);
         
         
         for (Task task : myarr){
             task.execute(); 
             System.out.println(task.toString());
             System.out.println("");
        }
         
         
         
         
       
        
    }
}
