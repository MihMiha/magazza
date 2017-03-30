package bank;

/**
 * Created by ova on 02.02.2017.
 */
public class SberBank extends AbcrakBaseBank {



    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void checkInfo(boolean cri) {
        System.out.println("сбер");
    }


    @Override
    public void giveCredit() {
        super.giveCredit();
    }


}
