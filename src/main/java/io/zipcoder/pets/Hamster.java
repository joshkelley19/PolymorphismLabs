package io.zipcoder.pets;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class Hamster extends Pet {
    public Hamster(String name){
        super(name);
    }
    @Override
    public String speak() {
        return "Meep?";
    }
}
