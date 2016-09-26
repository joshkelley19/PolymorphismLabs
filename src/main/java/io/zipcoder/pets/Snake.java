package io.zipcoder.pets;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class Snake extends Pet {
    public Snake(String name){
        super(name);
    }
    @Override
    public String speak() {
        return "SSsssSSSSSSssssSSss";
    }
}
