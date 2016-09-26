package io.zipcoder.pets;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class Engine {
    public ArrayList<Pet> pets = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void getPets(){
        int petCount;
        System.out.println("How many pets do you have?");
        petCount=scan.nextInt();
        for (int i=0;i<petCount;i++){
            String name;
            String type;
            System.out.println("What is the name of pet #"+(i+1)+"?");
            name=scan.next();
            System.out.println("What kind of animal is pet #"+(i+1)+"?");
            type=scan.next();
            addPet(type,name);
        }

    }


    public void addPet(String type, String name){
        Pet pet;
        switch (type.toUpperCase()){
            case "DOG":pet=new Dog(name);break;
            case "CAT":pet=new Cat(name);break;
            case "HAMSTER":pet=new Hamster(name);break;
            case "SNAKE":pet=new Snake(name);break;
            default:pet=new Pet(name);break;
        }
        pets.add(pet);
    }

    public void printAll(){
        System.out.println(pets);
    }

    public void everybodyNow(){
        for (Pet p : pets){
            System.out.println(p.toString());
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
