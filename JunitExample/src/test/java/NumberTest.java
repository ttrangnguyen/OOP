import org.example.Number;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void testAdd1(){
        Number n = new Number();
        int res = n.add(1, 3);
        assertEquals(4, res);
    }

    @Test
    public void testCheckFirstGreater1(){
        Number n = new Number();
        boolean res = n.checkFirstGreater(1, 3);
        assertFalse(res);
    }

    @Test
    public void testCheckFirstGreater2(){
        Number n = new Number();
        boolean res = n.checkFirstGreater(3, 1);
        assertTrue(res);
    }
}
