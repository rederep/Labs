package univerbig.domain;

import univerbig.list.AdminList;

/**
 * Created by student on 25-Apr-18.
 */
public class Administrator extends Human implements Comparable{
    private int typingSpeed;


    public int getTypingSpeed() {
        return typingSpeed;
    }

    public void setTypingSpeed(int typingSpeed) {
        this.typingSpeed = typingSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Administrator that = (Administrator) o;

        return typingSpeed == that.typingSpeed;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + typingSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "typingSpeed=" + typingSpeed +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Object o) {
        Administrator administrator = (Administrator) o;
        return Integer.compare(typingSpeed,administrator.typingSpeed);
    }
}
