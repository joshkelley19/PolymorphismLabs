package PolymorphismLab1Tests;

import io.zipcoder.pets.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class PolymorphismLab1Tests {
    Engine engine;
    Dog dog;
    Cat cat;
    @Before
    public void initialize(){
        engine = new Engine();
        dog=new Dog("Dan");
        cat=new Cat("Keith");
    }

    @Test
    public void createDogTest(){
        engine.addPet("dog","Paul");
        String expected = "Paul says Bow wow wow";
        String actual = engine.pets.get(0).toString();
        assertEquals(expected,actual);

    }

    @Test
    public void createCatTest(){
        engine.addPet("cat","Jack");
        String expected = "Jack says Meow";
        String actual = engine.pets.get(0).toString();
        assertEquals(expected,actual);
    }

    @Test
    public void speakDogTest(){
        String expected="Bow wow wow";
        String actual=dog.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void speakCatTest(){
        String expected="Meow";
        String actual=cat.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void setPetName(){
        cat.setName("Fred");
        String expected="Fred";
        String actual=cat.name;
        assertEquals(expected,actual);
    }
    @Test
    public void getPetName(){
        String expected = "Dan";
        String actual=dog.getName();
        assertEquals(expected,actual);
    }
}
