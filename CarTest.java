import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {
    Saab95 saab;
    Volvo240 volvo;

    @BeforeEach
    void newCar() {
        saab = new Saab95();
        volvo = new Volvo240();
    }

    @Test
    void colorCar(){
        Color saabColor = Color.red;
        assertEquals(saabColor, saab.getColor());

        Color volvoColor = Color.black;
        assertEquals(volvoColor, volvo.getColor());
    }

    @Test
    void nrDoors() {
        int volvoNrDoors = 4;
        assertEquals(volvoNrDoors, volvo.getNrDoors());

        int saabNrDoors = 2;
        assertEquals(saabNrDoors, saab.getNrDoors());
    }

    @Test
    void turboState() {
        saab.setTurboOn();
        assertTrue(saab.setTurboOn());

        saab.setTurboOff();
        assertFalse(saab.setTurboOff());
    }

    @Test
    void enginePowerCar() {
        double expectedPowerSaab = 125;
        assertEquals(expectedPowerSaab, saab.getEnginePower());

        double expectedPowerVolvo = 100;
        assertEquals(expectedPowerVolvo, volvo.getEnginePower());
    }

    @Test
    void testGas() {
        saab.gas(0.5);
        assertTrue(saab.getCurrentSpeed() > 0);

        volvo.gas(0.5);
        assertTrue(volvo.getCurrentSpeed() > 0);
    }

    @Test
    void testBrake() {
        saab.gas(1);
        double initialSpeedSaab = saab.getCurrentSpeed();
        saab.brake(0.5);
        double expectedSpeedSaab = initialSpeedSaab - (0.5 * saab.speedFactor());
        assertEquals(expectedSpeedSaab, saab.getCurrentSpeed());

        volvo.gas(1);
        double initialSpeedVolvo = volvo.getCurrentSpeed();
        volvo.brake(0.5);
        double expectedSpeedVolvo = initialSpeedVolvo - (0.5 * volvo.speedFactor());
        assertEquals(expectedSpeedVolvo, volvo.getCurrentSpeed());

    }

    @Test
    void testStartEngine() {
        saab.startEngine();
        assertTrue(saab.getCurrentSpeed() > 0);

        volvo.startEngine();
        assertTrue(volvo.getCurrentSpeed() > 0);
    }

    @Test
    void testStopEngine() {
        saab.stopEngine();
        assertEquals(0, saab.getCurrentSpeed());

        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed());
    }

    @Test
    void testGetModelName() {
        String saabModel = saab.getModelName();
        assertEquals("Saab95", saabModel);

        String volvoModel = volvo.getModelName();
        assertEquals("Volvo240", volvoModel);
    }

    @Test
    void testGetPosition() {
        Point saabPosition = saab.getPosition();
        assertEquals(new Point(0, 0), saabPosition);

        Point volvoPosition = volvo.getPosition();
        assertEquals(new Point(0, 0), volvoPosition);
    }

    @Test
    void testGetDirection() {
        double saabDirection = saab.getDirection();
        assertEquals(0.0, saabDirection);

        double volvoDirection = volvo.getDirection();
        assertEquals(0.0, volvoDirection);
    }

    @Test
    void carMove() {
        Point sStartingPosition = saab.getPosition();
        saab.startEngine();
        saab.gas(0.5);
        saab.move();

        Point updatedPosition = saab.getPosition();
        assertNotEquals(sStartingPosition, updatedPosition);

        Point vStartingPosition = volvo.getPosition();
        volvo.startEngine();
        volvo.gas(0.5);
        volvo.move();

        Point vUpdatedPosition = saab.getPosition();
        assertNotEquals(vStartingPosition, vUpdatedPosition);
    }


    @Test
    void testTurnLeft() {
        double initialDirection = saab.getDirection();

        saab.turnLeft();
        assertEquals((initialDirection - 90) % 360, saab.getDirection());

        initialDirection = volvo.getDirection();
        volvo.turnLeft();
        assertEquals((initialDirection - 90) % 360, volvo.getDirection());
    }

    @Test
    void testTurnRight() {
        double initialDirection = saab.getDirection();

        saab.turnRight();
        assertEquals((initialDirection + 90) % 360, saab.getDirection());

        initialDirection = volvo.getDirection();
        volvo.turnRight();
        assertEquals((initialDirection + 90) % 360, volvo.getDirection());
    }
}
