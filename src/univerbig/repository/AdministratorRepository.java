package univerbig.repository;

import univerbig.domain.Administrator;
import univerbig.list.AdminList;

/**
 * Created by student on 25-Apr-18.
 */
public interface AdministratorRepository {
    void addAdministrator(Administrator administrator);
    void removeAdministrator(Administrator administrator);
    AdminList getAllAdministrators();
}
