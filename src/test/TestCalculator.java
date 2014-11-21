package test;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import app.Calculator;

public class TestCalculator{
    Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
    }

    @Test
    public void testCal() {
        assertEquals(4.0, cal.suma(2.0, 2.0));
    }
}