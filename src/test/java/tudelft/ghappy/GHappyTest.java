package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GHappyTest {
    @Test
    public void testear(){
    GHappy happy = new GHappy();
    Assertions.assertTrue(happy.gHappy("xxggxx"));
    }

    @Test
    public void testear2(){
        GHappy happy = new GHappy();
        Assertions.assertFalse(happy.gHappy("xxgxx"));
    }

    @Test
    public void testear3(){
        GHappy happy = new GHappy();
        Assertions.assertFalse(happy.gHappy("xxggyygxx"));
    }
}
