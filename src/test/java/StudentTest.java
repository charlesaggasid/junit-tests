import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import static org.junit.Assert;


public class StudentTest {

    @Before


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
        Assert.assertEquals(88.33333333333333, s1.getGradeAverage(), 0);
        
    }

    //David solution

    @Test
    public void studentProperlyInitialized(){
       Student billy = new Student(1,"Billy"); //create student class
       Assert.assertEquals(1, billy.getId());
       Assert.assertEquals("Billy", billy.getName());
       Assert.assertTrue(billy.getGrades().isEmpty());
    }

    @Test
    public void addGradeTest(){ //
        Student billy = new Student(1,"Billy");
        Assert.assertTrue(billy.getGrades().isEmpty()); // its true because there's no added grade yet
        billy.addGrade(99);
        Assert.assertFalse(billy.getGrades().isEmpty());

        Assert.assertSame(88, billy.getGrades().isEmpty()); //assertfalse true because we added 99 to the array
    }
//
//    @Test
//    public void gradeAverageTest(){
//        Student billy = new Student(1, "Billy");
//        billy.addGrade(90);
//        Assert.assertEquals(90, );
//    }




}
