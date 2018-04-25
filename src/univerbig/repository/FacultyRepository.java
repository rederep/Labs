package univerbig.repository;

import univerbig.domain.Faculty;
import univerbig.list.FacultyList;

/**
 * Created by student on 25-Apr-18.
 */
public interface FacultyRepository {
    void addFaculty(Faculty faculty);
    void removeFaculty(Faculty  faculty);
    FacultyList getAllFaculties();
}
