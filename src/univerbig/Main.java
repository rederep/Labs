package univerbig;

import univerbig.controller.MainController;
import univerbig.domain.Administrator;
import univerbig.domain.University;
import univerbig.repository.AdministratorRepository;
import univerbig.repository.impl.db.mysql.AdministratorRepositoryMySQLImplementation;
import univerbig.repository.impl.memory.AdministratorRepositoryMemoryImplementation;
import univerbig.service.AdministratorService;

/**
 * Created by student on 25-Apr-18.
 */
public class Main {
    public static void main(String[] args) {

  /*      AdministratorRepository repository = AdministratorRepositoryMemoryImplementation.getInstance();
      //  AdministratorRepository repositoryDB = new AdministratorRepositoryMySQLImplementation().getInstance();

        repository.addAdministrator(new Administrator());
        repository.addAdministrator(new Administrator());
        System.out.println(repository.getAllAdministrators());*/

//        AdministratorService service = new AdministratorService();
//        Administrator a1 = new Administrator();
//        a1.setTypingSpeed(99);
//        Administrator a2 = new Administrator();
//        a2.setTypingSpeed(66);
//        Administrator a3 = new Administrator();
//        a3.setTypingSpeed(125);
//        Administrator a4 = new Administrator();
//        a4.setTypingSpeed(116);
//
//        service.addAdministrator(a1);
//        service.addAdministrator(a2);
//        service.addAdministrator(a3);
//        service.addAdministrator(a4);
//
//        service.printAdministrators(service.getAllAdministrators());
//        service.sortAminsByTypingSpeed(service.getAllAdministrators());
//        System.out.println("Sorted");
//        service.printAdministrators(service.getAllAdministrators());

        MainController m = new MainController();
        m.doWork();


    }
}
