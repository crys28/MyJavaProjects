/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class PersonViewer {
    
    public void view(Person person){
        System.out.println("Person: " + person.getType());
        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
                    System.out.println("Description:  " + person.getDescription());
        System.out.println("\n");
    }
    
}
