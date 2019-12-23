/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Wrapper {
   public static void main(String[] args) {
    
       
       Dog dog1 = new Dog();
       Dog dog2 = new Dog();
       
       dog1.age = 1;
       dog2.age = 2;
  
       int var1 = 10;
       int var2 = 11;
       
       System.out.println(dog1);
       System.out.println(dog2);
       System.out.println(var1);
       System.out.println(var2);
       
       //System.out.println(var1 + "," + var2);
       
       var2 = var1 ;
       dog1 = dog2 ;  
       
       System.out.println(dog1);
       System.out.println(dog2);
       System.out.println(var1);
       System.out.println(var2);
       
       var2 = 12;
       dog1.age = 3;
       
       System.out.println(dog1);
       System.out.println(dog2);
       System.out.println(var1);
       System.out.println(var2);
       
       
       
       
       
       
       
       
       /*
        String a = "tRue";
        String b = "120";
        String c = "32000";
        String d = "147895632";
        String e = "987654321987654321";
        String f = "4444.5d";
        String g = "2354.56f";
        
        
        
        Boolean bool1 = Boolean.parseBoolean(a);
        Byte byte1 = Byte.parseByte(b);
        Short short1 = Short.parseShort(c);
        Integer int1 = Integer.parseInt(d);
        Long long1 = Long.parseLong(e);
        Double double1 = Double.parseDouble(f);
        Float float1 = Float.parseFloat(g);
        
        System.out.println(bool1);
        */
    }
    
    
}
