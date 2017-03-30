package goods;

import deparOtdel.AbcrakBaseDepartament;
import interfaces.GoodsInterface;


public abstract class AbcrakBaseGoods implements GoodsInterface {
    private double price;
    private boolean isHasGarant;
    private String name;
    private AbcrakBaseDepartament departament;
    private String company;



    public AbcrakBaseGoods() {
    }

    public AbcrakBaseGoods(double price, boolean isHasGarant, String name, String company) {
        this.price = price;
        this.isHasGarant = isHasGarant;
        this.name = name;
        this.company = company;
    }

    public AbcrakBaseGoods(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasGarant() {
        return isHasGarant;
    }

    public void setHasGarant(boolean hasGarant) {
        isHasGarant = hasGarant;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public AbcrakBaseDepartament getDepartament() {
        return departament;
    }

    public void setDepartament(AbcrakBaseDepartament departament) {
        this.departament = departament;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
