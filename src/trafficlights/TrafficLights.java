package trafficlights;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Viktor on 03.09.2017.
 */
public class TrafficLights {
    private Light red;
    private Light yellow;
    private Light green;

    public TrafficLights(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        red = initLight("красный", br);
        yellow = initLight("жёлтый", br);
        green = initLight("зелёный", br);
    }

    private Light initLight(String colour, BufferedReader br){
        System.out.printf("Сколько минут горит %s свет?\n", colour);
        try{
            int time = Integer.parseInt(br.readLine());
            return new Light(colour, time);
        } catch (Exception e){
            System.out.println("Неправильно введено время");
            return initLight(colour, br);
        }
    }

    public void work(Light... args) {
        for (Light light: args) {
            System.out.printf("\n%s\n",light.getColour());
            try {
                Thread.sleep(60*1000*light.getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public Light getRed() {
        return red;
    }

    public Light getYellow() {
        return yellow;
    }

    public Light getGreen() {
        return green;
    }
}
