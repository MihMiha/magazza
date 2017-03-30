package main;

/**
 * Created by ova on 30.03.2017.
 */
public abstract class AbstractCar implements Car {
    protected int speed = 100;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void getDescriptin() {
        out(" \n"+this.getClass().getSimpleName()+
                " Speed ; " + speed  + " EngineVolume " + getEngineVoluem());


    }

    private void out(String str) {
        System.out.println(str);
    }
}
