import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    @Test
    @DisplayName("Simple Addition Test")
    void test () {
        Adder adder = new Adder();
        assertEquals(adder.add(2,3), 5);
    }

}