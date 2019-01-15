import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(21, 180, 35);
    }

    @Test
    public void getAge() {
        assertEquals(21,visitor.getAge());
    }

    @Test
    public void setAge() {
        visitor.setAge(23);
        assertEquals(23, visitor.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(180, visitor.getHeight(),0.01);
    }

    @Test
    public void setHeight() {
        visitor.setHeight(185);
        assertEquals(185, visitor.getHeight(), 0.01);
    }

    @Test
    public void getMoney() {
        assertEquals(35, visitor.getMoney(), 0.01);
    }

    @Test
    public void setMoney() {
        visitor.setMoney(50);
        assertEquals(50, visitor.getMoney(), 0.01);
    }




}