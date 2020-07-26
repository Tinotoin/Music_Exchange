import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest { 

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Bass Guitar", "String", false, "brown", 200);

    }

    @Test
    public void getInstrument() {
        assertEquals("Bass Guitar", guitar.getInstrument());
    }

    @Test
    public void getFamily(){
        assertEquals("String", guitar.getFamily());
    }

    @Test
    public void getAcoustic(){
        assertEquals(false, guitar.isAcoustic());
    }

    @Test
    public void getColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void getPrice(){
        assertEquals(200, guitar.getPrice());
    }

    @Test
    public void getStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Wow, what a groovy sound!", guitar.play("Wow, what a groovy sound!"));
    }

}
