
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
public class Queue implements Container {
    
    private ArrayList<Task> list;
    
    public Queue(){
    this.list = new ArrayList<>();
    }
    
    @Override
    public Task pop() {
     return list.remove(0);
       
    }

    @Override
    public void push(Task t) {
       list.add(t);
    }

   @Override
    public int size() {
       int size = list.size();
       return size;
       
    }

    @Override
    public boolean isEmpty() {
       
      return list.isEmpty();
    }

    @Override
    public void transferFrom(Container c) {
     while (!c.isEmpty()){
			this.push(c.pop());
		}
     
    }
    
}
