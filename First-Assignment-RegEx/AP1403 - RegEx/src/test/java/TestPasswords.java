import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswords {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testPasswords0() {
        assertEquals(1, ex.findValidPasswords("P@ssw0rd is my secret"));
    }

    @Test
    void testPasswords1() {
        assertEquals(3, ex.findValidPasswords("""
                Alice's new password is SecureP@ss1 but Bob still uses weakpass123.\s
                Charlie upgraded to Ultra_Strong99! while David set his to Admin123 (which is not secure).\s
                Their boss? He went with SuperSafe#42 and banned "password123"."""));
    }

    @Test
    void testPasswords2() {
        assertEquals(4, ex.findValidPasswords("""
                [09:15] Dev1: Just changed my password to CodeMaster@2025. \s
                [09:17] Dev2: Haha, mine's still qwerty123, no special chars. \s
                [09:19] Dev3: I use GitHubSuper#1 but need a better one. \s
                [09:21] Dev4: AdminPass42! is good, right? \s
                [09:23] Dev5: No, too simple. I switched to UltraSecure$99 last week. \s
                [09:25] Dev6: Wait, are we sharing passwords here? \uD83D\uDE02 \s
                """));
    }

    @Test
    void testPasswords3() {
        assertEquals(0, ex.findValidPasswords("NoSpecial1 WeakPass! NoDigits@"));
    }
}
