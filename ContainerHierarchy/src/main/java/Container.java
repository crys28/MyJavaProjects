
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public interface Container { 
    
    public Task pop();
    
    public void push(Task t);
    
    public int size();
    
    public boolean isEmpty();
    
    public void transferFrom(Container c);
    
    
}
