package trafficlights;

/**
 * Created by Viktor on 03.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        TrafficLights tl = new TrafficLights();
        tl.work(tl.getGreen(), tl.getYellow(), tl.getRed());
    }
}
