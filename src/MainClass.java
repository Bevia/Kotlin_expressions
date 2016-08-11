/**
 * Created by vbevia on 11/08/16.
 */

import java.util.List;
import java.util.Arrays;

public class MainClass {

    private static List<String> cities =
            Arrays.asList("Valencia", "Alicante", "Malaga", "Sevilla", "Barcelona");

    public static void findCityImperative(final List<String> cities) {
        boolean found = false;

        for(String city : cities) {
            if(city.contains("Valencia")) {
                found = true;
                break;
            }
        }

        System.out.println("Found the city in the list?:" + found);
    }

    public static void findCityDeclarative(final List<String> cities) {

        System.out.println("Found Barcelona?:" + cities.contains("Barcelona"));
    }

    public static void main(final String[] args) {

        findCityImperative(cities);
        findCityDeclarative(cities);
    }
}
