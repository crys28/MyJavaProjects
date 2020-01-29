
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Stack implements Container {
    
    private ArrayList<Task> list;
    
//    public Stack(){
//    this.list = new ArrayList();
//    }

    Stack(ArrayList<Task> task_lis) {
      this.list = new ArrayList();
    }
    
    @Override
    public Task pop() {
       
       
         int a = list.lastIndexOf(this);
       return list.remove(a);
        
    }

    @Override
    public void push(Task t) {
        list.add(list.size(),t);
        
    }

    @Override
    public int size() {
       int size = list.size();
       return size;
       
    }

    @Override
    public boolean isEmpty() {
      boolean yesnot = list.isEmpty();
      return yesnot;
    }

    @Override
    public void transferFrom(Container c) {
     while (!c.isEmpty()){
			this.push(c.pop());
		}
     
    }
    
}
