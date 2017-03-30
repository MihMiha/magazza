package boxx;

/**
 * Created by ova on 05.02.2017.
 */
public class Box <T>{
  private T i;

    public T getI() {
        return i;
    }

    public void setI(T i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Box<String> d = new Box<>();
        d.setI("frfvdf");

        System.out.println(d.getI());
         Box<Integer> integerBox = new Box<>();
        integerBox.setI(23453);


         System.out.println(integerBox.getI());


    }

}
