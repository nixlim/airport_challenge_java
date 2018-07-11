import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {
    String[] weather;

    public WeatherStation () {
        this.weather = new String[] {"sunny", "sunny", "sunny", "sunny", "stormy"};
    }

    public String report () {
        Random random = new Random();
        return this.weather[random.nextInt(this.weather.length)];
    }
}
