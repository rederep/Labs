package ua.ictloud.lessons.nestedclass;

/**
 * Created by student on 02-May-18. Патерн БИЛДЕР   строитель!
 */
public class PersonStatic {
    private String firstName;
    private String lastName;
    private String middleName;

    private PersonStatic() {

    }

    public static Builder newBuilder(){
        return  new PersonStatic().new Builder();
    }

    public Builder toBuilder(){
        return this.new Builder();
    }

    public class Builder {
        private Builder() {

        }

        public Builder setFirstName(String firstName) {
            PersonStatic.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            PersonStatic.this.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            PersonStatic.this.middleName = middleName;
            return this;
        }
        public PersonStatic build(){
            return PersonStatic.this;
        }

    }



    @Override
    public String toString() {
        return "PersonStatic{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
