package ua.ictloud.lessons.collection;

/**
 * Created by student on 07-May-18.
 */
public class PersenHash {
    public String name;

    public PersenHash(String name) {
        this.name = name;
    }




//для того чтоб
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersenHash that = (PersenHash) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "PersenHash{" +
                "name='" + name + '\'' +
                '}';
    }
}
