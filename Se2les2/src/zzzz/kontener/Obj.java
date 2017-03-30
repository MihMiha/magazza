package zzzz.kontener;

/**
 * Created by ova on 04.02.2017.
 */
public class Obj {
    private String ship;
    private int jshik;
    private int kontener;
  public static   final int TRI;

    static {
        TRI = 34;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public int getJshik() {
        return jshik;
    }

    public void setJshik(int jshik) {
        if (jshik >= 11) {

            this.jshik = jshik;
        } else {
            System.out.println("ящик "+ jshik);
        }
    }

    public int getKontener() {
        return kontener;
    }

    public void setKontener(int kontener) {
        if (kontener <=34) {
            this.kontener = kontener;


        } else {

            System.out.println( kontener- TRI+" помещаем вдругой контейнер " );



           this.kontener=34;





        }

    }





    public void load() {
        System.out.println("загружаем в 1 контейнер" +
                "   равен "+ kontener +" ящикам");

    }public void load2() {
        System.out.println("загружаюсь ящиком " +
                "  равен "+ jshik );

    }


}
//в 1 кораб =11 конт в 1 конт =34ящиков