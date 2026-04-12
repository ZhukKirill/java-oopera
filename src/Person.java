public class Person {
    final String name;
    final String surname;
    final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public enum Gender {
        MALE,
        FEMALE
    }
}
