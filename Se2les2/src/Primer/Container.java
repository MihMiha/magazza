package Primer;

import java.util.List;

/**
 * Created by ova on 05.02.2017.
 */
public class Container<T extends  Product> {
   private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    Container<Product> c1;
    Container<Product> c2;
    Container<Product> c3;
   // Container<String> c4;

    void copy(List<? extends Product> srs, List<? super  Product> dest) {
        for (Product p : srs) {
            dest.add(p);
        }
    }

}
