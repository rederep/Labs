package univerbig.service;

import univerbig.domain.Administrator;
import univerbig.list.AdminList;
import univerbig.repository.AdministratorRepository;
import univerbig.repository.impl.memory.AdministratorRepositoryMemoryImplementation;

import java.util.Arrays;

/**
 * Created by student on 27-Apr-18.
 */
public class AdministratorService {
    private AdministratorRepository administratorRepository;

    public AdministratorService() {
        administratorRepository = AdministratorRepositoryMemoryImplementation.getInstance();
    }

    public void addAdministrator(Administrator administrator) {
        administratorRepository.addAdministrator(administrator);
    }

    public void removeAdministrator(Administrator administrator) {
        administratorRepository.removeAdministrator(administrator);
    }

    public AdminList getAllAdministrators() {
        return administratorRepository.getAllAdministrators();
    }

    public void sortAminsByTypingSpeed(AdminList adminList) {
        Administrator[] result = adminList.getAdministrators();
        Arrays.sort(result);
        adminList.setAdministrators(result);
    }

    public void printAdministrators(AdminList adminList) {
        for (Administrator administrator:adminList.getAdministrators()) {
            System.out.println(administrator);
        }
    }
}
