package projects.f5.solar_system_java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class AppTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {

        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMain() {

        App.main(new String[0]);

        String output = outputStream.toString();

        assertThat(output, containsString("=== Planet 1 ==="));
        assertThat(output, containsString("Name: Earth"));
        assertThat(output, containsString("Number of satellites: 1"));
        assertThat(output, containsString("Mass: 5.972E24 kg"));
        assertThat(output, containsString("Volume: 1.08321E12 km³"));
        assertThat(output, containsString("Diameter: 12742 km"));
        assertThat(output, containsString("Average distance from Sun: 149600000 million km"));
        assertThat(output, containsString("Planet type: TERRESTRIAL"));
        assertThat(output, containsString("Visible to naked eye: true"));
        assertThat(output, containsString("Orbital period: 1 years"));
        assertThat(output, containsString("Rotation period: 1 days"));

        assertThat(output, containsString("=== Planet 2 ==="));
        assertThat(output, containsString("Name: Venus"));
        assertThat(output, containsString("Number of satellites: 0"));
        assertThat(output, containsString("Mass: 4.867E24 kg"));
        assertThat(output, containsString("Volume: 9.2843E11 km³"));
        assertThat(output, containsString("Diameter: 12104 km"));
        assertThat(output, containsString("Average distance from Sun: 108200000 million km"));
        assertThat(output, containsString("Planet type: TERRESTRIAL"));
        assertThat(output, containsString("Visible to naked eye: false"));
        assertThat(output, containsString("Orbital period: 1 years"));
        assertThat(output, containsString("Rotation period: 243 days"));
    }

    @BeforeEach
    void tearDown() {

        System.setOut(originalOut);
    }
}
