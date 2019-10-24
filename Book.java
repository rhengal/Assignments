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
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return qty;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
        return author;
    }
    
    public String toString(){
        return "Book(" + name +", price= " + price + ", qty = " + qty + " author = " + author +")";
    }
    
    
    
    
    
}
