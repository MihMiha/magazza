package deparOtdel;

import interfaces.DepartamentInterface;
import interfaces.EmployeesSotrudnikiInteface;
import interfaces.GoodsInterface;

import java.util.ArrayList;

/**
 * Created by ova on 02.02.2017.
 */
public abstract class AbcrakBaseDepartament implements DepartamentInterface{
    private String name;
    private ArrayList<EmployeesSotrudnikiInteface> empioeeList =new ArrayList<EmployeesSotrudnikiInteface>();
    private ArrayList<GoodsInterface> goodssList=new ArrayList<GoodsInterface>();

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public ArrayList<EmployeesSotrudnikiInteface> getSotrudnikList() {
        return empioeeList;
    }


    public void setEmpioeeList(ArrayList<EmployeesSotrudnikiInteface> empioeeList) {
        this.empioeeList = empioeeList;
    }
    @Override
    public ArrayList<GoodsInterface> getGoodList() {
        return goodssList;
    }

    public void setGoodssList(ArrayList<GoodsInterface> goodssList) {
        this.goodssList = goodssList;
    }


    public void addEmloyee(EmployeesSotrudnikiInteface employee) {
        employee.setDepartment(this);
        empioeeList.add(employee);
    }
public void addGoods(GoodsInterface goods) {
        goods.setDepartment(this);
        empioeeList.add((EmployeesSotrudnikiInteface) goods);
    }


}

