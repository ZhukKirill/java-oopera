import java.util.ArrayList;

public class MusicalShow extends Show {
    public final Person musicAuthor;
    public final String librettoText;

    public MusicalShow(ArrayList<Actor> listOfActors, Director director,
                       int duration, String title, Person musicAuthor, String librettoText) {
        super(listOfActors, director, duration, title);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
