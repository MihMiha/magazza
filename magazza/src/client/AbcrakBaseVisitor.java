package client;

import goods.PC;
import goods.Tv;
import interfaces.GoodsInterface;
import interfaces.VisitInteface;

/**
 * Created by ova on 02.02.2017.
 */
public abstract class AbcrakBaseVisitor implements VisitInteface{

    private String name;




    @Override
    public void buy(GoodsInterface goodsInterface) {
        System.out.println("название "
                + goodsInterface.getName());
        if (goodsInterface instanceof PC) { // приведение проверка

            ((PC) goodsInterface).seeMonitir();
        }
    }

    @Override
    public void returnGoods(GoodsInterface goodsInterface) {

    }

    @Override
    public String getName() {
        return name;
    }


}
