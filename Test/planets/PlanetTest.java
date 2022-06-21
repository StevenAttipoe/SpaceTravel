package planets;

import org.testng.Assert;
import org.testng.annotations.Test;
import space.Earth;
import space.Mars;
import space.RockyPlanet;

public class PlanetTest {
    @Test
    public void canLiveOnARockyPlanet(){
        RockyPlanet earth = new RockyPlanet();
        Assert.assertEquals(earth,earth);
    }

    @Test
    public void singletonTest(){
        Earth earth = null;
        Mars mars = null;
        earth.getInstance();
        mars.getInstance();
    }
}
