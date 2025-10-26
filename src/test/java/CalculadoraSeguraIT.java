
import org.junit.jupiter.api.Test;

import com.aula10.CalculadoraSegura;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSeguraIT {

    @Test
    void testSomaComValidacao() {
        CalculadoraSegura sc = new CalculadoraSegura();
        assertEquals(7, sc.somarSeguramente(3, 4));
        assertNull(sc.somarSeguramente(-1, 5));
    }
}
 