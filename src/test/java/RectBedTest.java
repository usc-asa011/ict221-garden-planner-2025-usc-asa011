import garden_planner.model.RectBed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the RectBed class.
 */
public class RectBedTest {

    @Test
    void testGetArea() {
        RectBed rect = new RectBed();

        // Default size should be 1.0 * 1.0 = 1.0
        assertEquals(1.0, rect.getArea(), "Area should be 1.0");

        // Set custom dimensions and verify the area
        rect.setWidth(2.0);
        rect.setHeight(3.0);
        assertEquals(6.0, rect.getArea(), "Area should be 6.0");
    }

    @Test
    void testGetPerimeter() {
        RectBed rect = new RectBed();

        // Default size should be 2 * (1.0 + 1.0) = 4.0
        assertEquals(4.0, rect.getPerimeter(), "Perimeter should be 4.0");

        // Set custom dimensions and verify the perimeter
        rect.setWidth(2.0);
        rect.setHeight(3.0);
        assertEquals(10.0, rect.getPerimeter(), "Perimeter should be 10.0");
    }

    @Test
    void testToString() {
        RectBed rect = new RectBed();
        // Default values should print as "Rectangle 0.00 0.00 1.00 1.00"
        assertEquals("Rectangle 0.00 0.00 1.00 1.00", rect.toString(), "toString should format the default values correctly");

        // Set custom values and test toString
        rect.setLeft(1.0);
        rect.setTop(2.0);
        rect.setWidth(3.0);
        rect.setHeight(4.0);
        assertEquals("Rectangle 1.00 2.00 3.00 4.00", rect.toString(), "toString should format the custom values correctly");
    }

    @Test
    void testSetLeft() {
        RectBed rect = new RectBed();
        rect.setLeft(5.0);
        assertEquals(5.0, rect.getLeft(), "Left value should be set correctly");
    }

    @Test
    void testSetTop() {
        RectBed rect = new RectBed();
        rect.setTop(6.0);
        assertEquals(6.0, rect.getTop(), "Top value should be set correctly");
    }

    @Test
    void testSetWidth() {
        RectBed rect = new RectBed();
        rect.setWidth(7.0);
        assertEquals(7.0, rect.getWidth(), "Width value should be set correctly");
    }

    @Test
    void testSetHeight() {
        RectBed rect = new RectBed();
        rect.setHeight(8.0);
        assertEquals(8.0, rect.getHeight(), "Height value should be set correctly");
    }
}
