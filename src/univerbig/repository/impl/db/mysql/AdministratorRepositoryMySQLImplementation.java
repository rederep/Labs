package univerbig.repository.impl.db.mysql;

import univerbig.domain.Administrator;
import univerbig.list.AdminList;
import univerbig.repository.AdministratorRepository;

/**
 * Created by student on 27-Apr-18.             //просто пример с БД, не используем
 */
public class AdministratorRepositoryMySQLImplementation implements AdministratorRepository {

    private DBMySQLConnection dbMySQLConnection;

    public AdministratorRepositoryMySQLImplementation() {
        dbMySQLConnection = DBMySQLConnection.getInstance();
    }

    @Override
    public void addAdministrator(Administrator administrator) {

    }

    @Override
    public void removeAdministrator(Administrator administrator) {

    }

    @Override
    public AdminList getAllAdministrators() {
        return null;
    }
}
