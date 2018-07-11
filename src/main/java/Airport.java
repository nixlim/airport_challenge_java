import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airport {
    ArrayList planes;
    int capacity;
    String weather;

    public Airport() {
        this.capacity = 0;
        this.weather = "sunny";
        this.planes = new ArrayList();
    }
}
