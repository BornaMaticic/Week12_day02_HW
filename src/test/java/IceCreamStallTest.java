import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    private IceCreamStall icy;

    @Before
    public void before(){
        icy = new IceCreamStall("Icycle", "Isla", "23");
    }

    @Test
    public void hasName(){
        assertEquals("Icycle", icy.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Isla", icy.getOwnerName());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(2, icy.defaultPrice(), 0.0002);
    }
}