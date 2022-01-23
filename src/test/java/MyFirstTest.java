import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void codeupIsNotCodeup(){
        String correct = "Codeup";
        String commonly = "CodeUp";

        //Writing Assert methods
        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void davidIsDavid() {
        String instructor = "David";
        String testWriter = "David";

        Assert.assertEquals(instructor, testWriter);
    }

    @Test
    public void listsAreDifferent(){
        List<String> languages = new ArrayList<>();
        List<String> names = new ArrayList<>(); // need to change to languages to pass assertsame
        languages.add("Latin");
        names.add("Latin");

        Assert.assertEquals(languages, names);
//        Assert.assertSame(languages, names); //fails because lang list is diff from names list, not the same obj, need to change names = languages
//        Assert.assertNotSame(languages, names); // will pass new ArrayList<>();

        //assert equals = check value
        //assert same = check the object
    }

    @Test
    public void arraysAreEqual(){
        int[] number = {1,2,3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3; //being created as different objects

        Assert.assertArrayEquals(number, otherNumbers);
    }

    @Test
    public void funWithPHP(){
        String language = "PHP";
        Assert.assertTrue(language.contains("H")); //allows to see if value match a value
        Assert.assertFalse(language.contains("P")); // false because it contains P, so it will fail
    }
}