package manee;

import testObject.*;


/**
 * Created by ova on 04.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String st1 = "остановка1";
        String st2 = "остановка1";
        String st3 = "остановка1";
        String st4 = "остановка1";
        String st5 = "остановка1";
        String st6 = "остановка1";

        Humen humen1 = new Humen();
        humen1.name = "ad";
        Humen humen2 = new Humen();
        humen2.name = "tom2";
        Humen humen3 = new Humen();
        humen3.name = "cjt";
        Humen humen4 = new Humen();
        humen4.name = "vog3";
        Humen humen5 = new Humen();
        humen5.name = "ad4";
        Humen humen6 = new Humen();
        humen6.name = "ad6";

        Dog dog = new Dog();
        dog.name = " cyka";
        humen2.addDog(dog);


        Bus bus = new Bus();
        bus.number = 1;
        bus.model = "xd";
        bus.drive();
        bus.stop(st2);
         humen1.moveToBus(bus);
         bus.stop(st4);
        humen1.moveFromBus(bus);

        humen2.moveToBus(bus);
        humen3.moveToBus(bus);
        humen4.moveToBus(bus);


        bus.stop(st5);

        humen2.moveFromBus(bus);

    }



}
