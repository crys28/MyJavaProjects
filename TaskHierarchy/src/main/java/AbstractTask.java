
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public abstract class AbstractTask {
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime executedAt;
    
    DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss.SSS");
    
    
    AbstractTask(){
    this.createdAt = LocalDateTime.now();
        
        
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }
    
    

    public void setId(String id) {
        this.id = id;
    }

    
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setExecutedAt(LocalDateTime executedAt) {
        this.executedAt = executedAt;
    }
    
    public void setExecutedAt(){
        this.executedAt = LocalDateTime.now();
    }
    

        @Override
        public String toString() {
            return "AbstractTask{" + "id=" + id + ", createdAt = " + createdAt.format(form) + ", executedAt = " + executedAt.format(form) + '}';
            
            
        }
    
    
    
    

}
