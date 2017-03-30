package CoolectionL11;

/**
 * Created by ova on 07.02.2017.
 */
public class Car22 {
    private String name;


    public Car22(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car22 car22 = (Car22) o;

        return name != null ? name.equals(car22.name) : car22.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
