import Attractions.Rollercoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {
    private Rollercoaster rc;
    private Visitor tall, shorty;

    @Before
    public void before(){
        rc = new Rollercoaster("Roller");
        tall = new Visitor(22, 205, 250.00);
        shorty = new Visitor(14, 178, 74.00);
    }

    @Test
    public void hasName(){
        assertEquals("Roller", rc.getName());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(6, rc.priceFor(shorty), 0.001);
    }

    @Test
    public void canDoubleChargeTallPeople(){
        assertEquals(12, rc.priceFor(tall), 0.001);
    }
}