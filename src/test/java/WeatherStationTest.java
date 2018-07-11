import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherStationTest {
    WeatherStation weatherStation = new WeatherStation();

    @Test
    @DisplayName("Returns either sunny or stormy when #report is called")
    void reportStormyOrSunny () {
        assertTrue(weatherStation.report().equals("sunny") || weatherStation.report().equals("stormy"));
    }

}