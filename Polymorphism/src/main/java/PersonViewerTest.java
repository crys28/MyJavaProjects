/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class PersonViewerTest {
    public static void main(String[] args){
    
        Student a = new Student();
        a.name = "Iacomachi Cristian";
        a.email = "iacomachi_cristian@yahoo.com";
        a.desc = "Grade B";
        
        Student b = new Student();
        b.name = "Mihai Grozavu";
        b.email = "grozavel_mishanya@gmail.com";
        b.desc = "Grade D";    
        
        Lecturer a1 = new Lecturer();
        a1.name = "Ion";
        a1.email = "Gospodin";
        a1.desc = "Math";
        
        Employee a2 = new Employee();
        a2.name = "George Enescu";
        a2.email = "george.enescu@mail.ru";
        a2.desc = "Cleaning";
        
        PersonViewer view = new PersonViewer();
        view.view(a);
        view.view(b);
        view.view(a1);
        view.view(a2);
        
        
    }
}
