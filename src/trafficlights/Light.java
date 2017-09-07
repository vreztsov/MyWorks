package trafficlights;

/**
 * Created by Viktor on 03.09.2017.
 */
public class Light {
    private String colour;
    private int time;
    Light(String colour, int time) {
        this.colour = colour;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public String getColour() {
        return colour;
    }
}
