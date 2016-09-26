package io.zipcoder.pets;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class Engine {
    ArrayList<Pet> pets = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void requestPet(){
        String type;
        String name;
        char another;
        System.out.println("What kind of pet do you have?");
        type = scan.next();
        System.out.println("What is his/her name?");
        name = scan.next();
        addPet(type,name);
    }
    public boolean checkForAnotherPet(){
        do{
            System.out.println("Do you have another pet? Enter Y or N");
            switch (scan.next().toUpperCase().charAt(0)){
                case 'Y':return true;
                case 'N':return false;
                default:
                    System.out.println("I did not understand that entry.");
            }
        }while (true);

    }

    public void addPet(String type, String name){
        pets.add(new Pet(type,name));
    }

    public void printAll(){
        System.out.println(pets);
    }

    public void everybodyNow(){
        for (Pet p : pets){
            if(p instanceof Dog){
                ((Dog)p).speak();
            }
            if(p instanceof Cat){
                ((Cat)p).speak();
            }
            if (p instanceof Snake){
                ((Snake)p).speak();
            }
            if (p instanceof Hamster){
                ((Hamster)p).speak();
            }
        }
    }
}
