package boxx;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by ova on 05.02.2017.
 */
public class SomeType <T>{
    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    public void test(List<Integer> integers) {
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        SomeType<?> someType = new SomeType();
        List<String> list = Arrays.asList("value");
        someType.test(list);
    }
}
