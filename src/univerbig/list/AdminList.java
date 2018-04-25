package univerbig.list;

import univerbig.domain.Administrator;

import java.util.Arrays;

/**
 * Created by student on 25-Apr-18.     обертка для domain массивов Admitistrtor  умный класс с масивом
 */
public class AdminList {
    private static final int INITIAL_SIZE = 100;
    private int administratorsLogicSize = 0;
    private Administrator[] administrators = new Administrator[INITIAL_SIZE];

    public Administrator[] getAdministrators() {
        return Arrays.copyOf(administrators, administratorsLogicSize);  //новый массив
    }

    public void addAdministrator(Administrator administrator) {
        administrators[administratorsLogicSize++] = administrator;
    }

    public void addAdministrators(Administrator[] administrators) {
        for (int i = 0; i < administrators.length; i++) {
            addAdministrator(administrators[i]);
        }
    }

    public void removeAdministrator(Administrator administrator) {
        Administrator[] result = new Administrator[INITIAL_SIZE];
        int resultIndex = 0;
        for (int i = 0; i < administratorsLogicSize; i++) {
            if (!administrators[i].equals(administrator)) {
                result[resultIndex++] = administrators[i];
            }
        }
        administrators = result;
        administratorsLogicSize = resultIndex;
    }

    @Override
    public String toString() {
        return Arrays.toString(administrators);
    }
}
