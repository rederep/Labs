package ua.ictloud.lessons.java8.streams.Test;

public enum Male {
        MAN ("Man"),
        WOMAN("Woman");
        private String male;

    Male(String male) {
        this.male = male;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }
}
