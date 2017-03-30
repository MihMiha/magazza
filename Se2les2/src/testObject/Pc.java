package testObject;

/**
 * Created by ova on 04.02.2017.
 */
public class Pc {
    private String name;
    private int ram;
    private int hdd;
    private double weight;

    private boolean isCdRead;
    private Pc[] userPc;
    private boolean admin;
    private String statys="notyfi";


    public Pc(String name, boolean admin) {
        this.name = name;
        this.admin = admin;
    }

    public void rebootUserPc() {
        if (!admin) {
            System.out.println(" У пк " + name + " нет прав на перезагрузку это не админ пк");
            return;
        }
        for (int i = 0; i < userPc.length; i++) {
            userPc[i].reboot();
        }
        System.out.println();

    } public void shutDownUserPc() {
        if (!admin) {
            System.out.println(" У пк " + name + " нет прав на перезагрузку это не админ пк");
            return;
        }
        for (int i = 0; i < userPc.length; i++) {
            userPc[i].off();
        }
        System.out.println();

    } public void swichDownUserPc() {
        if (!admin) {
            System.out.println(" У пк " + name + " нет прав на перезагрузку это не админ пк");
            return;
        }
        for (int i = 0; i < userPc.length; i++) {
            userPc[i].on();
        }
        System.out.println();

    }






    public Pc[] getUserPc() {
        return userPc;
    }

    public void setUserPc(Pc[] userPc) {
        this.userPc = userPc;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getStatys() {
        return statys;
    }

    public void setStatys(String statys) {
        this.statys = statys;
    }

    public Pc() {

    }

    public Pc(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;

    }

    public Pc(String name) {
        this.name = name;
        on();
    }

    public void reboot() {
        System.out.println("перезагрузка");
    }

    public void read() {
        if (isCdRead) {
            print("считать данные");

        } else {

            System.out.println("не могу считать");
        }
    }


    public void setCdRead(boolean isCdRead) {
        this.isCdRead = isCdRead;
    }


    public String getName() {
        return name;
    }






    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0) {

            this.ram = ram;
        } else {
            System.out.println("neverno <0" + ram);
        }
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        if (hdd > 0) {

            this.hdd = hdd;

        } else {
            System.out.println("такого не бывает " + hdd + "гб");

        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void on() {
        print("я вкл " + name);
    }

    public void off() {
        print("я выкл ");

    }

    public void load() {
        print("я загружаюсь объем жесткого" +
                " диска равен " + hdd + " гб");

    }

    private void print(String string) {
        System.out.println(string);

    }

    public boolean isCdRead() {
        return isCdRead;
    }



}