package pl.sda.czwa;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PolygonTest {

    @Test
    public void testValidPolygonCreation() {
        Polygon p = new Polygon(5);

        assertNotNull(p);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPolygonCreation() {
        Polygon p = new Polygon(2);
    }
}