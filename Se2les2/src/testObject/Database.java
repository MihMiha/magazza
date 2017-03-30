package testObject;

/**
 * Created by ova on 04.02.2017.
 */
public class Database {
    public String nameDataBase;
    public int size;


    public void write() {
        System.out.println(" Write");

    }

    public void delete() {
        System.out.println(" Delete");

    }public void shutdown() {
        System.out.println(" DB"+ nameDataBase+" shutdown");

    }public void load() {
        System.out.println(" load "+ size);

    }public void replicate() {
        System.out.println("DB "+ nameDataBase+" repliCate");

    }
}
