package ua.ictloud.lessons.collection;

/**
 * Created by student on 07-May-18.
 */
public class PersenHashTest {
    public String name;

    public PersenHashTest(String name) {
        this.name = name;
    }




//для того чтоб
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersenHashTest that = (PersenHashTest) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public String toString() {
        return "PersenHashTest{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }


}
