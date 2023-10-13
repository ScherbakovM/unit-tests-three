package number_in_interval;
import even_number.EvenNumber;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class NumberInIntervalTest {


    @Before
    public void setUp() {
        NumberInInterval num = new NumberInInterval();
    }

    @Test
    public void testNumberInInterval() {
        assertTrue(NumberInInterval.checkInterval(50)); // число внутри интервала
        assertFalse(NumberInInterval.checkInterval(25)); // число на границе интервала
        assertFalse(NumberInInterval.checkInterval(100)); // число на границе интервала
        assertFalse(NumberInInterval.checkInterval(0)); // число вне интервала
        assertFalse(NumberInInterval.checkInterval(150)); // число вне интервала
    }
}
