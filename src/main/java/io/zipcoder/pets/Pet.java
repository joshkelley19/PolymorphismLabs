package io.zipcoder.pets;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class Pet {
    public String name;

    public Pet(String name){
        this.name=name;
    }

    public Pet(){

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return "Generic Animal Noise...";
    }

    public String toString(){
        return name+" says "+speak();
    }
}
