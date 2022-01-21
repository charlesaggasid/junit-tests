import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private String expected;
    private String hiJay;

    @Before
    public void setUp(){
        this.expected = "Hello, World!";
        this.hiJay = "Hello, Jay!";
    }

    @Test
    public void testForHelloWorld(){
        Assert.assertEquals(this.expected, HelloWorld.hello());
    }

}
