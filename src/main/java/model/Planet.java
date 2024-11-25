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
}
