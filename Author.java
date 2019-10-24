/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4assignments;

/**
 *
 * @author Alex
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
        
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
        
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "(" + name + ",email: " +email + ",gender: " + gender + ")";
    }
}
