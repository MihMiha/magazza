package kurici.Kurici;

import kurici.AbstraktHen;


public class UkrainianHen extends AbstraktHen {
    private int N;
    String Sssss = "Ukrainian";

    @Override
    public int getCountOfEggsPerMonth() {
        N = 40;
        return N;
    }


    public void getDescription() {
        getCountOfEggsPerMonth();
        String s = "getDescription() родительского класса>" + " Моя страна " + Sssss + ". Я несу+" + N + " яиц в месяц.";
        System.out.println(s);


    }


}
