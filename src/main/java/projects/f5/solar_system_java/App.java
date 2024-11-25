package projects.f5.solar_system_java;

import projects.f5.solar_system_java.model.Planet;
import projects.f5.solar_system_java.model.PlanetType;
import projects.f5.solar_system_java.printer.PrintPlanet;

public final class App {
    public static void main(String[] args) {

        Planet planet1 = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149600000, PlanetType.TERRESTRIAL, true,
                1, 1);
        Planet planet2 = new Planet("Venus", 0, 4.867e24, 9.2843e11, 12104, 108200000, PlanetType.TERRESTRIAL, false,
                1, 243);

        System.out.println();
        System.out.println("=== Planet 1 ===");
        PrintPlanet.planetInfo(planet1);

        System.out.println("\n=== Planet 2 ===");
        PrintPlanet.planetInfo(planet2);
    }
}
