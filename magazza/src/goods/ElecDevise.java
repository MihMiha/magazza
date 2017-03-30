package goods;

import deparOtdel.AbcrakBaseDepartament;
import interfaces.ElectroDeviceInterface;

/**
 * Created by ova on 02.02.2017.
 */
public class ElecDevise extends AbcrakBaseGoods implements ElectroDeviceInterface {

    public ElecDevise() {
    }


    public ElecDevise(String name) {
        super(name);
    }

    public void on() {

    }public void off() {

    }


    @Override
    public void loads() {

    }

    @Override
    public void setDepartment(AbcrakBaseDepartament abcrakBaseDepartament) {

    }
}
