package boxx;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ova on 05.02.2017.
 */
public class Box1<T extends Number> {
    private T y;

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }


     Number sum(Box1<? extends Number > y, Box1<? extends Number> y1) {//компилятор ругается
        return y.getY().doubleValue() + y1.getY().floatValue();
    }

// List
// Map

    public static void main(String[] args) {
        Box1<Integer> w1 = new Box1<>();
        Box1<Double> w2 = new Box1<>();
        Box1<Float> w3 = new Box1<>();
       // Box1<String> w4 = new Box1<>();//запрещено

        w1.setY(3);
        w2.setY(7.0);
        w3.setY((float) 0.1);

       Number d = w1.getY() + w2.getY();
        System.out.println(d);

        List r = new ArrayList();
        List<String> list = new ArrayList<>();
        r = list;
        r.add(8);
        System.out.println(r);

    }
}
