package JavaProgrammingElementsLv1;


public class VolumeOfEarth {
    public static void main(String[] args) {
        // Data
        double radiusKm = 6378;
        double radiusMiles = radiusKm * 0.621371;
        // Volume of earth
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        // Volume of earth in cubic miles
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        // Output
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm, volumeMiles);
    }
}
