import com.javaddtfreight.freight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class freightTest {

    @Test
    public void simpleFreightCalculationTest() {

        // configure
        double distance = 30;
        double weight = 2;
        int volume = 2;
        double expectedCost = 45;

        // execute
        double actualCost = freight.freightCalculation(distance, weight, volume);

        // validate
        assertEquals(expectedCost, actualCost);

    }
}
