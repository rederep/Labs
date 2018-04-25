package univerbig.domain;

/**
 * Created by student on 25-Apr-18.
 */
public abstract class Human {
    private String firstNAme;
    private String lastNAme;
    private String middleNAme;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (firstNAme != null ? !firstNAme.equals(human.firstNAme) : human.firstNAme != null) return false;
        if (lastNAme != null ? !lastNAme.equals(human.lastNAme) : human.lastNAme != null) return false;
        return middleNAme != null ? middleNAme.equals(human.middleNAme) : human.middleNAme == null;

    }

    @Override
    public int hashCode() {
        int result = firstNAme != null ? firstNAme.hashCode() : 0;
        result = 31 * result + (lastNAme != null ? lastNAme.hashCode() : 0);
        result = 31 * result + (middleNAme != null ? middleNAme.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstNAme='" + firstNAme + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", middleNAme='" + middleNAme + '\'' +
                '}';
    }
}
