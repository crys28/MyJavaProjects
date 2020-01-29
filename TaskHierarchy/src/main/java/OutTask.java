
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
public class OutTask extends AbstractTask implements Task {
   String msg;
    
    OutTask(String msg){
        this.msg = msg;
        
    }
     
    @Override
    public void execute(){
        System.out.println("Message : " + this.msg);
        
        this.setExecutedAt();
    }
    
    
    
}
