package testObject;

/**
 * Created by ova on 04.02.2017.
 */
public class Bus {
    public String model;
    public int number;

    public void drive() {
        System.out.println(" , автобус поехал   " + " номер автобуса "+number);
    }

    public void stop() {
        System.out.println("автобус остановился  ");
    }



    public void beep() {
        System.out.println(" beeep ");
    } public void stop(String nameOstanovki) {
        System.out.println(" останова назкание "+nameOstanovki);
    }
}
