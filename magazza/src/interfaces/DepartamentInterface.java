package interfaces;

import java.util.ArrayList;

/**
 * Created by ova on 02.02.2017.
 */
public interface DepartamentInterface {
    String getName();

    ArrayList<EmployeesSotrudnikiInteface> getSotrudnikList();
    ArrayList<GoodsInterface> getGoodList();

}
