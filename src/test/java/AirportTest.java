import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AirportTest {
    Airport airport;

    @BeforeEach
    void setUp () {
        airport = new Airport(1);
    }

    @Test
    @DisplayName("Has an attribute planes which is an ArrayList")
    void planesMethod () {
        assertTrue(airport.planes instanceof ArrayList);
    }

    @Test
    @DisplayName("Should allow the designer to set capacity")
    void setCapacityOnInstantiation () {
        airport = new Airport(20);
        assertEquals(20, airport.capacity);
    }
}
