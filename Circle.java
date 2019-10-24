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
public class Circle {
    int a;
    char b;
    private double radius = 1.0;
    private String colour = "red";
    
    public void setRadius(double radius){
        
        this.radius = radius;}
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2) ;
        return area;
    }
    public String toString(){
        String description = "You have created a " + colour + " circle, with a radius of : " + radius;
        return description;
        
    }
}