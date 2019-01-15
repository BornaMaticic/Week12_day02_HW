import Stalls.TobacoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobacoStallTest {
    private TobacoStall tabby;
    private Visitor underAge;
    private Visitor smoker;

    @Before
    public void setUp() throws Exception {
        tabby = new TobacoStall("TabbyStar", "Molly", "66");
        underAge = new Visitor(16, 167, 99.00);
        smoker = new Visitor(34, 175, 34.00);
    }

    @Test
    public void isAllowedTo() {
        assertEquals(true, tabby.isAllowedTo(smoker));
    }

    @Test
    public void isNotAllowedTo() {
        assertEquals(false, tabby.isAllowedTo(underAge));
    }

    @Test
    public void defaultPrice() {
        assertEquals(6, tabby.defaultPrice(), 0.0001);
    }

    @Test
    public void priceFor() {
        assertEquals(6, tabby.priceFor(smoker), 0.0002);
    }

    @Test
    public void getName() {
        assertEquals("TabbyStar", tabby.getName());
    }

    @Test
    public void getOwnerName() {
    }

    @Test
    public void getParkingSpot() {
        assertEquals("Molly", tabby.getOwnerName());
    }

    @Test
    public void getRating() {
        tabby.setRating(3);
        assertEquals(3, tabby.getRating());
    }
}