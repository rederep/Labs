package univerbig;

import univerbig.domain.Administrator;
import univerbig.domain.University;

/**
 * Created by student on 25-Apr-18.
 */
public class Main {
    public static void main(String[] args) {
        University u1 = new University();
        System.out.println(u1);

        u1.addAdministrator(new Administrator());
        u1.addAdministrator(new Administrator());
        System.out.println(u1);

        System.out.println("---------------");
        u1.removeAdministrator(new Administrator());
        System.out.println(u1);

    }
}
