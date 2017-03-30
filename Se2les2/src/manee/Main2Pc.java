package manee;

import testObject.Pc;

/**
 * Created by ova on 04.02.2017.
 */
public class Main2Pc {
    public static void main(String[] args) {
            Pc pc = new Pc("асус");
            Pc pc2 = new Pc("хуясус");

        System.out.println("pc = " + pc.getName());
        System.out.println("pc2 = " + pc2.getName());


        Pc pc3;
        pc3 = pc;
        pc = pc2;
        pc2 = pc3;
        pc3 = null;
        System.out.println("pc = " + pc.getName());
        System.out.println("pc2 = " + pc2.getName());


        Pc pc1 = new Pc("csmsyng",128,350,5);



//        pc.setName("IBM");
//        pc.getNameCountri();
//        pc.setHdd(67);
//        pc.getHdd();
//
//        pc.read();
//        pc.setCdRead(true);
//        pc.read();


        pc1.on();
        pc1.load();
        pc1.off();
    }
}
