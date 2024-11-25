package projects.f5.solar_system_java.printer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import projects.f5.solar_system_java.model.Planet;
import projects.f5.solar_system_java.model.PlanetType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PrintPlanetTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testPlanetInfo() {

        Planet testPlanet = new Planet(
                "Earth",
                1,
                5.972e24,
                1.08321e12,
                12742,
                149,
                PlanetType.TERRESTRIAL,
                true,
                1,
                1);

        PrintPlanet.planetInfo(testPlanet);
        String output = outputStream.toString();

        assertThat(output, containsString("Name: Earth"));
        assertThat(output, containsString("Number of satellites: 1"));
        assertThat(output, containsString("Mass: 5.972E24 kg"));
        assertThat(output, containsString("Volume: 1.08321E12 km³"));
        assertThat(output, containsString("Diameter: 12742 km"));
        assertThat(output, containsString("Average distance from Sun: 149 million km"));
        assertThat(output, containsString("Planet type: TERRESTRIAL"));
        assertThat(output, containsString("Visible to naked eye: true"));
        assertThat(output, containsString("Orbital period: 1 years"));
        assertThat(output, containsString("Rotation period: 1 days"));
        assertThat(output, containsString("Density:"));
        assertThat(output, containsString("Is it an outer planet? Yes"));
    }

    @BeforeEach
    void tearDown() {
        System.setOut(originalOut);
    }
}
