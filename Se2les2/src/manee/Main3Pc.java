package manee;

import testObject.Pc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ova on 04.02.2017.
 */
public class Main3Pc {
    public static void main(String[] args) throws IOException {
        int r = 0;

        System.out.println("Сколько вы хотите созать компов");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int s = Integer.parseInt(bufferedReader.readLine());
            Pc[] userPc = new Pc[s];

            System.out.println("в зале расположенно " + userPc.length + " компов");

            for (int i = 0; i < s; i++) {
                userPc[i] = new Pc("PC" + i, false);
                System.out.println(userPc[i].getName());
            }
            System.out.println("+++++++++++++++++++");


            if (userPc.length == 0) {
                System.out.println("нет не одного компа");
                return;
            }

            Pc admin = new Pc("Admin", true);


            admin.setUserPc(userPc);

            userPc[0].rebootUserPc();

            admin.swichDownUserPc();
            admin.rebootUserPc();
            userPc[0].setStatys("running");

             admin.shutDownUserPc();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
