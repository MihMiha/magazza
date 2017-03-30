package testObject;

/**
 * Created by ova on 04.02.2017.
 */
public class Humen {
    public String name;
    public Dog dog;


    public void moveToBus(Bus bus) {
        if (dog == null) {

            System.out.println(name + " двигается автобус " + bus.number);

        } else {
            System.out.println(name + " двигается автобус " + bus.number + " c cщбакой" + dog.name);
        }
    }

    public void moveFromBus(Bus bus) {
        if (dog == null) {

            System.out.println(name + " выходит автобус " + bus.number);

        } else {
            System.out.println(name + " выходит автобус " + bus.number + " c cщбакой" + dog.name);
        }
    }

    public void addDog(Dog dog) {
        this.dog = dog;
    }

//    public void go() {
//
//        System.out.println(" человек заходит(ят)  в автобус");
//    }
//
//    public void exit() {
//
//        System.out.println(" человек выходят из автобуса ");
//    }


}

