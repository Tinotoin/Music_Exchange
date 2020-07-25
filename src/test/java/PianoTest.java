import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Steiner", "String", true, "black", 1000, true);
    }

    @Test
    public void getFamily(){
        assertEquals("String", piano.getFamily());
    }

    @Test
    public void getAcoustic(){
        assertEquals(true, piano.isUpright());
    }

    @Test
    public void getColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void getPrice(){
        assertEquals(1000, piano.getPrice());
    }

    @Test
    public void canSell(){
        assertEquals(1000, piano.getPrice());
    }

}
