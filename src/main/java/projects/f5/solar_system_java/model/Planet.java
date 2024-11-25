package projects.f5.solar_system_java.model;

public class Planet {
    private String name = null;
    private int numberOfSatellites = 0;
    private double mass = 0.0;
    private double volume = 0.0;
    private int diameter = 0;
    private int averageDistanceFromSun = 0;
    private PlanetType planetType;
    private boolean visibleToNakedEye = false;
    private int orbitalPeriod = 0;
    private int rotationPeriod = 0;

    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter,
            int averageDistanceFromSun, PlanetType planetType, boolean visibleToNakedEye, int orbitalPeriod,
            int rotationPeriod) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceFromSun = averageDistanceFromSun;
        this.planetType = planetType;
        this.visibleToNakedEye = visibleToNakedEye;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
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

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public int getRotationPeriod() {
        return rotationPeriod;
    }

    public double calculateDensity() {
        if (volume != 0) {
            return mass / (volume * 1e9);
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
