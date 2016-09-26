package io.zipcoder.pets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joshuakelley on 9/26/16.
 */
public class View {


    public static void main(String[] args) {
        Engine engine = new Engine();
        do {
            engine.requestPet();
        }while (engine.checkForAnotherPet());
        engine.printAll();
    }
}
