/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4assignments;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class W2D4Assignments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = myAge();
        System.out.println("You are "+ age + " years old");
        
        
        //Exercise 1
        Circle testing = new Circle();
        System.out.println(testing.a);
        System.out.println(testing.b);
        
        
        //Exercise 2
       Circle circle = new Circle();
       circle.setRadius(10.0);
       System.out.println(circle.toString());
       System.out.println("the area of the circle is : " + circle.getArea());
       
       //Exercise 3
       Book book = new Book();
       Author author = new Author();
       book.setName("Black book");
       book.setPrice(10);
       book.setQty(1000);
       book.setAuthor(author);
       author.setName("Steven");
       author.setEmail("steven@gmail.com");
       author.setGender('m');
       
       System.out.println(book);
        
        
        
    }
    
    public static int myAge(){
        int n;
        Scanner age = new Scanner(System.in);
        System.out.println("Please type your age.");
        while (!age.hasNextInt() || (n = age.nextInt()) <= 0) {
        System.out.print("please type a positive integer"+ "\n");
        age.nextLine();
    }
    age.nextLine();
    return n;    
    }
}
