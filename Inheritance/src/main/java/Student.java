/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class Student extends Person {
    private String program ;
    private int year ;
    private double fee ;
    
    public Student(String name, String address, String program , int year, double fee){
    super(name,address);
        
    this.program = program;
    this.year = year;
    this.fee = fee;
    }
    
    public String getProgram(){
    return program;
    }
    
    public void setProgram(String program){
    this.program = program;
    }
    
    public Integer getYear(){
    return year;
    }
    
    public void setYear(int year){
    this.year = year;
    }
    
    public Double getFee(){
    return fee;
    }
    
    public void setFee(double fee){
    this.fee = fee;
    }
    
    @Override
    public String toString(){ 
     return "Student [" + super.toString() + "program=" + program + ",year=" + year + ",fee=" + fee + "]" ;
    }
    
    
}
