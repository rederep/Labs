package univerbig.domain;

import univerbig.list.AdminList;
import univerbig.list.FacultyList;

import java.util.Arrays;

/**
 * Created by student on 25-Apr-18.
 */
public class University {
    private String name;
    private String city;
    private int yearOfFound;
    private int accreditation;
    private Rector rector;

    private AdminList adminList;
    private FacultyList facultyList;

    public University() {
    }

    public University(String name, String city, int yearOfFound, int accreditation, Rector rector, AdminList adminList, FacultyList facultyList) {
        this.name = name;
        this.city = city;
        this.yearOfFound = yearOfFound;
        this.accreditation = accreditation;
        this.rector = rector;
        this.adminList = adminList;
        this.facultyList = facultyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfFound() {
        return yearOfFound;
    }

    public void setYearOfFound(int yearOfFound) {
        this.yearOfFound = yearOfFound;
    }

    public int getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(int accreditation) {
        this.accreditation = accreditation;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public AdminList getAdminList() {
        return adminList;
    }

    public void setAdminList(AdminList adminList) {
        this.adminList = adminList;
    }

    public FacultyList getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(FacultyList facultyList) {
        this.facultyList = facultyList;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", yearOfFound=" + yearOfFound +
                ", accreditation=" + accreditation +
                ", rector=" + rector +
                ", adminList=" + adminList +
                ", facultyList=" + facultyList +
                '}';
    }
}
