package kurici.Kurici;

import kurici.AbstraktHen;


public class RussianHen extends AbstraktHen{

    private int N;
    String Sssss = "Russian";

    @Override
    public int getCountOfEggsPerMonth() {
        N = 10;
        return N;
    }


    public void getDescription() {
        getCountOfEggsPerMonth();
        String s = "getDescription() родительского класса>" + " Моя страна " + Sssss + ". Я несу+" + N + " яиц в месяц.";
        System.out.println(s);


    }
}
