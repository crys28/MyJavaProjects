/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Lecturer implements Person {
    String email,name,desc;
    
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }
    
    public String getSubject() {
        return getDescription();
    }
    
     @Override
    public String getType(){
      return "Lecturer";
    }
    
}
