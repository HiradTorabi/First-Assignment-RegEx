import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPalindromes {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testPalindrome0() {
        String input = "madam racecar level";

        // palindrome words
        List<String> expected = new ArrayList<>();
        expected.add("madam");
        expected.add("racecar");
        expected.add("level");

        assertEquals(expected, ex.findPalindromes(input));
    }

    @Test
    void testPalindrome1() {
        String input = "hello world";

        // palindrome words
        List<String> expected = new ArrayList<>();

        assertEquals(expected, ex.findPalindromes(input));
    }

    @Test
    void testPalindrome2() {
        String input = "Step on no pets";

        // palindrome words
        List<String> expected = new ArrayList<>();

        assertEquals(expected, ex.findPalindromes(input));
    }

    @Test
    void testPalindrome3() {
        String input = """
                Madam, did you see Bob running? I asked Kayak and radar to wait at the civic center.\s
                The level of security was high, but I noticed a racecar driving past. A deed was done in the noon,\s
                and many said it was a referable situation.
                """;

        // palindrome words
        List<String> expected = new ArrayList<>();
        expected.add("Madam");
        expected.add("did");
        expected.add("Bob");
        expected.add("Kayak");
        expected.add("radar");
        expected.add("civic");
        expected.add("level");
        expected.add("racecar");
        expected.add("deed");
        expected.add("noon");

        assertEquals(expected, ex.findPalindromes(input));
    }
}
