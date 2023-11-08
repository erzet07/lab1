import java.awt.*;


public abstract class Cars implements Movable{
    public int facing;
    private int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    public String modelName; // The car model name
    private double positionX;
    private double positionY;


    public Cars(int nrDoors, Color color, int enginePower, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.positionX = 0;
        this.positionY = 0;
        this.facing = 0;
        stopEngine();

    }


    public void move() {
        calculateMove();
    }





    public void turnLeft() {
        this.facing += -1;

    }
    public void turnRight() {
        this.facing += 1;
    }
    private void calculateMove() {
        if (this.facing % 4 == -1 || this.facing % 4 == 3) {

            this.positionX -= getCurrentSpeed();
        }
        else if (this.facing % 4 == -2 || this.facing % 4 == 2) {
            this.positionY -= getCurrentSpeed();
        }
        else if (this.facing % 4 == -3 ||this.facing % 4 == 1) {
            this.positionX += getCurrentSpeed();
        }
        else {
            this.positionY += getCurrentSpeed();
        }
    }

    public String getPosition() {
        return (this.positionX + " " + this.positionY);
    }



    private int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }












}
