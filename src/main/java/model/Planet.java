package model;

public class Planet {
    private String name = null;
    private int numberOfSatellites = 0;
    private double mass = 0.0;
    private double volume = 0.0;
    private int diameter = 0;
    private int averageDistanceFromSun = 0;
    private PlanetType planetType;
    private boolean visibleToNakedEye = false;

    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter,
            int averageDistanceFromSun, PlanetType planetType, boolean visibleToNakedEye) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceFromSun = averageDistanceFromSun;
        this.planetType = planetType;
        this.visibleToNakedEye = visibleToNakedEye;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAverageDistanceFromSun() {
        return averageDistanceFromSun;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public boolean isVisibleToNakedEye() {
        return visibleToNakedEye;
    }

    public double calculateDensity() {
        if (volume != 0) {
            return mass / volume;
        } else {
            return 0;
        }
    }

    public boolean isOuterPlanet() {
        final double ASTEROID_BELT_MIN_DISTANCE = 2.1 * 149597870;
        final double ASTEROID_BELT_MAX_DISTANCE = 3.4 * 149597870;
        double distanceInKm = averageDistanceFromSun * 1000000;

        return distanceInKm > ASTEROID_BELT_MAX_DISTANCE || distanceInKm < ASTEROID_BELT_MIN_DISTANCE;
    }

}
