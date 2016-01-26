import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by wscown on 1/20/16.
 */


public class InitializationLab1Spec {

    @Test
    public void testColorfulThing(){

        //With
        ColorfulThing testRed = new ColorfulThing(Colors.RED);
        ColorfulThing testGreen = new ColorfulThing(Colors.GREEN);
        ColorfulThing testBlue = new ColorfulThing(Colors.BLUE);
        ColorfulThing testYellow = new ColorfulThing(Colors.YELLOW);
        ColorfulThing testPurple = new ColorfulThing(Colors.PURPLE);

        //When and then
        assertEquals("Should return an enum type within the group enumTester", Colors.RED, testRed.getColor());
        assertEquals("Should return an enum type within the group enumTester", Colors.GREEN, testGreen.getColor());
        assertEquals("Should return an enum type within the group enumTester", Colors.BLUE, testBlue.getColor());
        assertEquals("Should return an enum type within the group enumTester", Colors.YELLOW, testYellow.getColor());
        assertEquals("Should return an enum type within the group enumTester", Colors.PURPLE, testPurple.getColor());
    }
}

