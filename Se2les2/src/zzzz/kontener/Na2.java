package zzzz.kontener;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by ova on 07.02.2017.
 */
public class Na2 {
    public static final int Kon = 11;
    public static final int JSHIK = 34;
    public static int ship = 0;
    public static int konten = 0;

    public static void main(String[] args) {

        starT();
    }

    public static void starT() {
        System.out.println("введите ящики ");


        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();

        for (int i = 0; i < d; i += JSHIK) {
            konten++;
        }
        for (int i = 0; i < konten; i += Kon) {
            ship++;
        }
        System.out.println(ship + " корабл");
        System.out.println(konten + " контейнеров");
        System.out.println(d + " ящиков");
    }
}

