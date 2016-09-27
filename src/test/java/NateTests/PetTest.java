package NateTests;
import org.junit.Assert;
import org.junit.Test;
import io.zipcoder.pets.*;

/**
 * Created by nathanielholloway on 9/26/16.
 * This is the test for the Pet class.
 */
public class PetTest {

    @Test
    public void speak(){
        Pet thisPet = new Dog("Fred");
        String words = thisPet.speak();
        Assert.assertNotNull("Bow wow wow",words);
    }

    @Test
    public void getName(){
        Pet thisPet = new Cat("Mike");
        thisPet.setName("Gavin");
        String expected = "Gavin";
        String actual = thisPet.getName();
        Assert.assertSame(expected,actual);
    }

    @Test
    public void setName(){
        Pet thisPet = new Pet();
        thisPet.setName("Fredo");
        String expected = "Fredo";
        String actual = thisPet.getName();
        Assert.assertSame(expected,actual);
    }


}
