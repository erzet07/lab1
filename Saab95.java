import org.w3c.dom.ls.LSOutput;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.LinkedList;

public class Saab95 extends Cars{

    private boolean turboOn;


    public Saab95(){

        super(2,Color.red,125,"Saab95");
	    turboOn = false;

    }
    


    private void setTurboOn(){
	    turboOn = true;
    }

    private void setTurboOff(){
	    turboOn = false;
    }
    
    private double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    private void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    private void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
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
