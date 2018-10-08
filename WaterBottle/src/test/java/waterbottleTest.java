import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class waterbottleTest {

    public Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void hasVolume(){
       assertEquals(100 , waterbottle.hasVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90 ,waterbottle.canDrink());
    }
    @Test
    public void getEmpty(){
        assertEquals(0,waterbottle.getEmpty());
    }
    @Test
    public void getFilled(){
        assertEquals(100, waterbottle.getFilled());
    }
}
