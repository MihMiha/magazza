package CoolectionL11;


import java.util.*;

public  class CoolectionL1 {
    public static void main(String[] args) {

        exemple();

    }

    public static void exemple() {
      hasSetExample();
       // treeSetExampl();
      //  linkedHashSetExample();

    }

    private static void treeSetExampl() {

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(34);
        tree.add(21);
        tree.add(67);
        tree.add(23);
        tree.add(676);
        tree.add(453);
        tree.add(23);
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }




    }

    public static void linkedHashSetExample() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(34);
        set.add(334);
        set.add(123);
        set.add(546);
        set.add(162);
        set.add(565);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
    }

    public static void hasSetExample() {
        Set<Car22> cars = new HashSet<>();
        Car22 car2 = new Car22(" BMW ");
        Car22 car3 = new Car22(" NIVA ");
        Car22 car4 = new Car22(" NISSAN ");
        Car22 car5 = new Car22(" NISSAN ");
        Car22 car6 = new Car22(" MERS-BENS ");


        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

      //  cars.add("гондурас");
        Iterator<Car22> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car22 car22 = iterator.next();

            System.out.println(car22.getName());


        }System.out.println("cars.size = " + cars.size());
        
    }

}
