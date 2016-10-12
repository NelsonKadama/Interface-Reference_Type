/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omphemetse
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question1 {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        ArrayList<Fruit> arrFruit = new ArrayList<Fruit>();
        char choice;
        
        while(true){
            System.out.println("Enter option: (1) add fruit (2) quit:");
            choice = input.next().charAt(0);
            switch(choice){
                case '1':
                    String name,colour;
                    String mass;
                    System.out.println("Enter name, colour and mass in kg separated by space");
                    name=input.next();
                    colour=input.next();
                    mass = input.next();
                    
                    arrFruit.add(new Fruit(name,colour,mass));
                    
                    break;
                case '2':
                    Collections.sort(arrFruit);
                    for(Fruit k: arrFruit)
                        System.out.println(k);
                    System.exit(0);
                    break;
            }
        }
        
    }
}
