package even_number;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenNumberTest {

    @Before
    public void setUp() {
       EvenNumber number = new EvenNumber();
    }

    @Test
    public void testEvenNumber() {
        assertTrue(EvenNumber.evenOddNumber(2));
        assertTrue(EvenNumber.evenOddNumber(0));
        assertTrue(EvenNumber.evenOddNumber(-2));
    }

    @Test
    public void testOddNumber() {
        assertFalse(EvenNumber.evenOddNumber(1));
        assertFalse(EvenNumber.evenOddNumber(-1));
    }
}
