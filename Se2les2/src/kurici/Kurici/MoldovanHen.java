package kurici.Kurici;

import kurici.AbstraktHen;


public class MoldovanHen extends AbstraktHen {

    private int N;
    String Sssss = "Moldova";

    @Override
    public int getCountOfEggsPerMonth() {
        N = 20;
        return N;
    }


    public void getDescription() {
        super.getDescription();
        getCountOfEggsPerMonth();
        String s = " Моя страна " + Sssss + ". Я несу+" + N + " яиц в месяц.";
        System.out.println(s);


    }
}
