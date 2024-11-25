package projects.f5.solar_system_java.printer;

import java.util.ArrayList;
import java.util.List;

import projects.f5.solar_system_java.model.Planet;

public class PrintPlanet {
    public static void planetInfo(Planet planet) {
        List<String> attributes = new ArrayList<>();
        attributes.add("Name: " + planet.getName());
        attributes.add("Number of satellites: " + planet.getNumberOfSatellites());
        attributes.add("Mass: " + planet.getMass() + "kg");
        attributes.add("Volume: " + planet.getVolume() + "km³");
        attributes.add("Diameter: " + planet.getDiameter() + "km");
        attributes.add("Average distance from Sun: " + planet.getAverageDistanceFromSun() + "million km");
        attributes.add("Planet type: " + planet.getPlanetType());
        attributes.add("Visible to naked eye: " + planet.isVisibleToNakedEye());
        attributes.add("Orbital period: " + planet.getOrbitalPeriod() + "years");
        attributes.add("Rotation period: " + planet.getRotationPeriod() + "days");

        for (String attribute : attributes) {
            System.out.println(attribute);
        }

        System.out.println("-----------------------");
        System.out.println("Density: " + planet.calculateDensity() + " kg/km³");
        System.out.println("Is it an outer planet? " + planet.isOuterPlanet());
    }
}
