package main;

/**
 * Created by ova on 30.03.2017.
 */
public class SimplCar extends AbstractCar {

    @Override
    public double getEngineVoluem() {
        return 1.7;

    }


    @Override
    public void getDescriptin() {
        super.getDescriptin();
        System.out.println(" Som custom");
    }
}
