import java.util.Objects;

public class Actor extends Person {
    protected final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return super.equals(actor) && Objects.equals(height, actor.height) && Objects.equals(name, actor.name)
                && Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", {height=" + height +
                '}';
    }
}
