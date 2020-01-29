
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class RandomOutTask extends AbstractTask implements Task{
  
    double r ;
   
    RandomOutTask(){
        this.r =  Math.random() * 10 ;          
    }
    
    @Override
    public void execute(){
        System.out.println("Random : " + r);
        this.setExecutedAt();
    }
    
}
