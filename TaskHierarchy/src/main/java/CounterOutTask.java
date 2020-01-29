
import java.time.LocalDateTime;
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
public class CounterOutTask extends AbstractTask implements Task{
        static int nr;
        
    
    CounterOutTask(){
       //   nr = 0 ;                     
    }
    
    
    @Override
    public void execute(){
        nr++;
        System.out.println("Counter :" + nr);
        this.setExecutedAt();
    }
    
}
