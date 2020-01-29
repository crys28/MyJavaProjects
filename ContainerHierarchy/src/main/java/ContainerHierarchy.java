
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
public class ContainerHierarchy {
    public static void main(String[] args){
    RandomOutTask rot = new RandomOutTask();
		ArrayList<Task> task_lis = new ArrayList<>();
		ArrayList<Task> task_lis2 = new ArrayList<>();
		task_lis.add(rot);
		task_lis.add(rot);
		task_lis.add(rot);
		task_lis.add(rot);
		task_lis2.add(rot);
		task_lis2.add(rot);
		task_lis2.add(rot);
		Stack stack = new Stack(task_lis);
		Container container = new Stack(task_lis2);
		System.out.println("container: " + container.size());
		System.out.println("stack: " + stack.size());
		stack.transferFrom(container);
		System.out.println("container: " + container.size());
		System.out.println("stack: " + stack.size());
        
        
    
    }
    
    
}
