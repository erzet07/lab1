import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarsTest {

    private Volvo240 v;
    private Saab95 s;


    @Before
    public void car(){
        s = new Saab95();
        v = new Volvo240();

    }


    @Test
    public void move() {
        s.startEngine();
        s.move();
        assert(s.getPosition().equals("0.0 0.1"));
        v.startEngine();
        v.incrementSpeed(5);
        v.move();
        assert(v.getPosition().equals("0.0 6.35"));
    }

    @Test
    public void turnLeft() {
        s.turnLeft();
        v.turnLeft();
        v.turnLeft();
        assert(s.facing == -1 && v.facing == -2);
    }


    @Test
    public void turnRight() {
    }

    @Test
    public void getPosition() {
    }

    @Test
    public void getNrDoors() {

    }

    @Test
    public void getEnginePower() {
    }

    @Test
    public void getCurrentSpeed() {
    }

    @Test
    public void getColor() {
    }

    @Test
    public void setColor() {
    }

    @Test
    public void startEngine() {
    }

    @Test
    public void stopEngine() {
    }
}