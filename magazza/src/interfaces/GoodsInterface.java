package interfaces;

import deparOtdel.AbcrakBaseDepartament;


public interface GoodsInterface {

    double getPrice();

    boolean isHasGarant();

    String getName();

    DepartamentInterface getDepartament();

    String getCompany();

    void loads();

    void setDepartment(AbcrakBaseDepartament abcrakBaseDepartament);
}
