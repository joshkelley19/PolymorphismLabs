package io.zipcoder.pets;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }
    @Override
    public String speak() {
        return "Bow wow wow";
    }

}
