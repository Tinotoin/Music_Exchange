import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.Piano;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument instrument;
    Guitar guitar;
    Piano piano;
    private ArrayList<Instrument> Instrument;


    @Before
    public void before(){
        shop = new Shop("Ray's", Instrument, 1000);
        guitar = new Guitar("Bass Guitar", "String", false, "black", 200);
        piano = new Piano("Steiner", "string", true, "black", 1000, true);
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's", shop.getName());
    }

    @Test
    public void canGetItems(){
        assertEquals(0, shop.getItems());
    }

    @Test
    public void canSellGuitar(){
        assertEquals("Great sale!", shop.sell("Sold!"));
    }

    @Test
    public void canSellPiano(){
        assertEquals("Great sale!", shop.sell("Selt!"));
    }

    @Test
    public void canGetCash(){
        assertEquals(1000, shop.getCash());
    }


}
