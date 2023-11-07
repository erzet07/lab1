import org.w3c.dom.ls.LSOutput;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.LinkedList;

public class Volvo240 extends Cars{

    private final static double trimFactor = 1.25;

    public Volvo240(){

        super(4,Color.black,100,"Volvo240");



    }



    private double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    private void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    private void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    private void brake(double amount){
        decrementSpeed(amount);
    }
}
