package univerbig.list;

import univerbig.domain.Faculty;

import java.util.Arrays;

/**
 * Created by student on 25-Apr-18.   обертка для domain массивов Faculty  умный класс с масивом
 */
public class FacultyList {
    private static final int INITIAL_SIZE = 100;
    private int facultiesLogicSize = 0;
    private Faculty[] faculties = new Faculty[INITIAL_SIZE];

    public Faculty[] getFaculties() {
        return Arrays.copyOf(faculties, facultiesLogicSize);
    }

    public void addFaculty(Faculty faculty) {
        faculties[facultiesLogicSize++] = faculty;
    }

    public void AddFaculis(Faculty[] faculties) {
        for (int i = 0; i < faculties.length; i++) {
            addFaculty(faculties[i]);
        }
    }

    public void removeFaculty(Faculty faculty) {
        Faculty[] result = new Faculty[INITIAL_SIZE];
        int resultIndex = 0;
        for (int i = 0; i < facultiesLogicSize; i++) {
            if (!faculties[i].equals(faculty)) {
                result[resultIndex++] = faculties[i];
            }
        }
        faculties = result;
        facultiesLogicSize = resultIndex;
    }

    @Override
    public String toString() {
        return  Arrays.toString(faculties);
    }
}
