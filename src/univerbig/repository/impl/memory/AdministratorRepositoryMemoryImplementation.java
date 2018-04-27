package univerbig.repository.impl.memory;

import univerbig.domain.Administrator;
import univerbig.list.AdminList;
import univerbig.repository.AdministratorRepository;

/**
 * Created by student on 27-Apr-18.
 */
public class AdministratorRepositoryMemoryImplementation implements AdministratorRepository {
    private AdminList adminList;  // источник данных, может БД и т.п.

    private static AdministratorRepositoryMemoryImplementation instance;

    private AdministratorRepositoryMemoryImplementation() {
        adminList = new AdminList();
    }

    public static AdministratorRepositoryMemoryImplementation getInstance() {       //синглтон
        if (instance == null) {
            instance = new AdministratorRepositoryMemoryImplementation();
        }
        return instance;
    }

    @Override
    public void addAdministrator(Administrator administrator) {
        adminList.addAdministrator(administrator);
    }

    @Override
    public void removeAdministrator(Administrator administrator) {
        adminList.removeAdministrator(administrator);
    }

    @Override
    public AdminList getAllAdministrators() {
        return adminList;
    }
}
