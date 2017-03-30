package interfaces;

import deparOtdel.AbcrakBaseDepartament;

/**
 * Created by ova on 02.02.2017.
 */
public interface EmployeesSotrudnikiInteface {
    String getName();

    boolean isFree();

    DepartamentInterface getDepartment();


    void setDepartment(AbcrakBaseDepartament abcrakBaseDepartament);
}
