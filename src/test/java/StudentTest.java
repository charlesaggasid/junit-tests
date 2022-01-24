import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert;


public class StudentTest {
    @Test
    public void testNewStudent(){
        Student s1 = new Student(1l, "Charles"); // create new obj
        Student charles = null;
        Assert.assertNull(charles); // checking if null is instantiated.
        Assert.assertNotNull(s1); //checking if s1 is not instantiated.
    }

    @Test
    public void testAddGrade(){
        Student s1 = new Student(1L, "Charles"); //create new obj
        s1.addGrade(90); // adding the grade
        Assert.assertSame(90, s1.getGrades().get(0)); //With assertNotSame, it's possible to verify if two variables don't refer to the same object. Otherwise, when we want to verify that two variables refer to the same object, we can use the assertSame assertion.
    }

    @Test
    public void testAverageGrade(){
        Student s1 = new Student(1L, "Charles");
        s1.addGrade(90);
        s1.addGrade(80);
        s1.addGrade(95);
        Assert.assertEquals(85, s1.getGradeAverage(), 0);
        
    }




}
