package javaTesting.collectionsTesting;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class SimpleCollectionTest {

    @Test
    public void firstCollectionTest() {
        String[] nombres = { "zero", "un", "dos", "tres" };

        List<String> numerals = new ArrayList<>();

        for (String s : nombres) {
            numerals.add(s);
        }

        numerals.add("quatre");

        assertTrue(numerals.size() == 5);

        List<String> llistaNumeros = Arrays.asList(nombres);

        // llistaNumeros.add("quatre"); // Esto lanzaría una excepción si se descomenta

        assertTrue(llistaNumeros.size() == 4);
    }
}
