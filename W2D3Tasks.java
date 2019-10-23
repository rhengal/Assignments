/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3tasks;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class W2D3Tasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // age project 
        Scanner myAge = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = myAge.nextInt();
        if(age<=0) {
            System.out.println("Age is invalid");
        }
        else if(age<16){
            System.out.println("You are not allowed to drive");
        
        }
        else if(age<=17){
            System.out.println("You are allowed to drive, but not to vote");
        }
        else if(age<=21){
            System.out.println("You are allowed to vote but not drink");
        }
        else System.out.println("You can do anything");
        
        
        //planet weight project
        Scanner myWeight1 = new Scanner(System.in);
        System.out.println("what is your weight in kg?");
        double weight1 = myWeight1.nextDouble();
        Scanner myPlanet1 = new Scanner(System.in);
        System.out.println("Which planet are you on?");
        String planet1 = myPlanet1.nextLine();
        if (planet1.equals("Earth")) {
            System.out.println("your weight on Earth is " + weight1 + " kg");
           
        }
        else if(planet1.equals("Venus")){
            weight1 = weight1*0.78;
            System.out.println("your weight on Venus is " + weight1 + " kg");
        }
        else if (planet1.equals("Mars")){
            weight1 = weight1*0.39;
            System.out.println("your weight on Mars is " + weight1 + " kg");
        } 
        else if (planet1.equals("Jupiter")){
            weight1 = weight1*2.65;
            System.out.println("your weight on Jupiter is " + weight1 + " kg");
        }
        else if( planet1.equals("Saturn")){
            weight1 = weight1*1.17;
            System.out.println("your weight on Saturn is " + weight1 + " kg");
        }
        else if (planet1.equals("Uranus")){
            weight1 = weight1*1.05;
            System.out.println("your weight on Uranus is " + weight1 + " kg");
        }
        else if(planet1.equals("Neptune")){
            weight1 = weight1*1.23;
            System.out.println("your weight on Neptune is " + weight1 + " kg");
        }
        else System.out.println("Planet is invalid");
        
        // Project Day
        System.out.println("Today is " + getDayName(4));
        
        // Project Upper Case Name
        System.out.println(name());
    }
    
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;    }
    public static String name(){    
        Scanner myFirstName = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = myFirstName.nextLine();
        Scanner myLastName = new Scanner(System.in);
        System.out.println("What is your last name? ");
        String lastName = myLastName.nextLine();
        String fullName = firstName + lastName;
        String fullNameUpper = fullName.toUpperCase();
        
        return fullNameUpper;
        
    }
}
