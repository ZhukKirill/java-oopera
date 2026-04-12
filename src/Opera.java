import java.util.ArrayList;

public class Opera extends  MusicalShow {
    public final int choirSize;

    public Opera(ArrayList<Actor> listOfActors, Director director, int duration, String title,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(listOfActors, director, duration, title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Opera{" +
                "listOfActors=" + listOfActors +
                '}';
    }
}
