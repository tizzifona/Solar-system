package projects.f5.solar_system_java.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanetTest {

    private Planet earth;

    @BeforeEach
    void setUp() {
        earth = new Planet(
                "Earth",
                1,
                5.972e24,
                1.08321e12,
                12742,
                149600000,
                PlanetType.TERRESTRIAL,
                true,
                365,
                1);
    }

    @Test
    void testCalculateDensity() {
        double density = earth.calculateDensity();
        assertThat(density, closeTo(5513.2, 0.1));
    }

    @Test
    void testGetAverageDistanceFromSun() {
        assertThat(earth.getAverageDistanceFromSun(), equalTo(149600000));
    }

    @Test
    void testGetName() {
        assertThat(earth.getName(), equalTo("Earth"));
    }

    @Test
    void testGetNumberOfSatellites() {
        assertThat(earth.getNumberOfSatellites(), equalTo(1));
    }

    @Test
    void testGetMass() {
        assertThat(earth.getMass(), equalTo(5.972e24));
    }

    @Test
    void testGetVolume() {
        assertThat(earth.getVolume(), equalTo(1.08321e12));
    }

    @Test
    void testGetDiameter() {
        assertThat(earth.getDiameter(), equalTo(12742));
    }

    @Test
    void testGetOrbitalPeriod() {
        assertThat(earth.getOrbitalPeriod(), equalTo(365));
    }

    @Test
    void testGetRotationPeriod() {
        assertThat(earth.getRotationPeriod(), equalTo(1));
    }

    @Test
    void testGetPlanetType() {
        assertThat(earth.getPlanetType(), equalTo(PlanetType.TERRESTRIAL));
    }

    @Test
    void testIsVisibleToNakedEye() {
        assertThat(earth.isVisibleToNakedEye(), is(true));
    }

    @Test
    void testIsOuterPlanet() {
        assertThat(earth.isOuterPlanet(), is(true));
    }
}
