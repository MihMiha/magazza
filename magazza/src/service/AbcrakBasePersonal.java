package service;

import interfaces.DepartamentInterface;
import interfaces.EmployeesSotrudnikiInteface;

/**
 * Created by ova on 02.02.2017.
 */
public abstract class AbcrakBasePersonal implements EmployeesSotrudnikiInteface {
    private String name;
    private DepartamentInterface department;
    private boolean free;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartamentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartamentInterface department) {
        this.department = department;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
