/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Student {
    private String name;
    
    Student(){
       this("Unknown");
    }
    Student(String newName){
        name = newName;
    }

    void print(){
        System.out.println("Name : " + name);
    }

}
