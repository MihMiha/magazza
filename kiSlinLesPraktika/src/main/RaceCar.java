package main;

/**
 * Created by ova on 30.03.2017.
 */
public class RaceCar extends AbstractCar {
    public RaceCar() {
        speed = 200;
    }

    @Override
    public double getEngineVoluem() {
        return 3.5;
    }
}
