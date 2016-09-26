package io.zipcoder.pets;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class Pet {
    String name;
    String type;

    public Pet(String type,String name){
        this.type=type;this.name=name;
    }

    public Pet(){

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void speak(){
        System.out.println("Speaking...");
    }

    public String toString(){
        return "My "+type+"'s name is "+name;
    }
}
