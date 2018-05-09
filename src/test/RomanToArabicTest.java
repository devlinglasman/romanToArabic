package test;

import main.RomanToArabic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToArabicTest {

    @Test
    public void testI() {
        assertEquals(1, RomanToArabic.convert("I"));
    }

}
