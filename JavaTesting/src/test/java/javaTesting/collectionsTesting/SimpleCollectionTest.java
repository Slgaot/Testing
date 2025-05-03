package javaTesting.collectionsTesting;

import org.junit.Test;
import java.util.ArrayList;
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

        assertTrue(numerals.size() == 4);
    }
}
