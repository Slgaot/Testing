package javaTesting.arraysTesting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArraysTest {

    @Test
    public void exempleArraySenzill() {
        String[] numerals = { "zero", "un", "dos", "tres" };

        assertEquals("zero", numerals[0]);

        String nombres = "";

        for (String n : numerals) {
            nombres += n + '|';
        }

        assertEquals(nombres, "zero|un|dos|tres|");
    }
}

