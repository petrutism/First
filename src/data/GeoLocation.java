package data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class GeoLocation {

    //variables
    private final BigDecimal lat;
    private final BigDecimal lon;
    private static int numLocations = 0;

    //constructors
    public GeoLocation() {
        lat = getGeneratedValue(-90, 90);
        lon = getGeneratedValue(-90, 90);
        numLocations++;
    }

    public GeoLocation(double a, double b) {
        lat = BigDecimal.valueOf(a);
        lon = BigDecimal.valueOf(b);
        numLocations++;
    }

    //copy constructor
    public GeoLocation(GeoLocation geolocation) {
        lat = geolocation.lat.add(getGeneratedValue(-0.1, 0.1));
        lon = geolocation.lon.add(getGeneratedValue(-0.1, 0.1));
        numLocations++;
    }

    private BigDecimal getGeneratedValue(double min, double max) {
        Random random = new Random();
        double result = random.doubles(min, max).findFirst().orElse(0);
        return BigDecimal.valueOf(result).setScale(6, RoundingMode.DOWN);
    }

    public void print() {
        System.out.printf("[%s , %s]%n", lat, lon);
    }

    public static double distance(GeoLocation name1, GeoLocation name2) {
        double lat1 = name1.lat.doubleValue();
        double lat2 = name2.lat.doubleValue();
        double lon1 = name1.lon.doubleValue();
        double lon2 = name2.lon.doubleValue();

        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
// convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
// apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));

        BigDecimal res = new BigDecimal(rad * c);
        BigDecimal rounded = res.setScale(1, RoundingMode.DOWN);

        return rounded.doubleValue();
    }

    public static int getNumLocations() {
        return numLocations;
    }
}
