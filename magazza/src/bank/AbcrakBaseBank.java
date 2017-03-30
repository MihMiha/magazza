package bank;

import interfaces.BankInterface;

/**
 * Created by ova on 02.02.2017.
 */
public abstract class AbcrakBaseBank implements BankInterface {
    private String name;
    private String creditDescripcion;
    public static int requstCount;


    @Override
    public void checkInfo() {
        requstCount++;
    }

    public abstract void checkInfo(boolean cri);


    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getcreditDescripcion() {
        return creditDescripcion;
    }


}
