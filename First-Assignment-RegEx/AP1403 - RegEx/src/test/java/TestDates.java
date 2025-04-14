import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestDates {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testDates0() {
        String input = "Today is 12/09/2023.";
        String expected = "12/09/2023";
        assertEquals(expected, ex.findDate(input));
    }

    @Test
    void testDates1() {
        String input = "Meeting: 2024-07-15 at noon.";
        String expected = "2024-07-15";
        assertEquals(expected, ex.findDate(input));
    }

    @Test
    void testDates2() {
        String input = "No date here.";
        assertNull(ex.findDate(input));
    }

    @Test
    void testDates3() {
        String input = "Release date will be 2025/01/01 (hopefully) at midnight";
        String expected = "2025/01/01";
        assertEquals(expected, ex.findDate(input));
    }

    @Test
    void testDates4() {
        String input = "Meet me at 45/12/2023.";
        assertNull(ex.findDate(input));
    }
}
