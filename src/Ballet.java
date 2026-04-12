import java.util.ArrayList;

public class Ballet extends MusicalShow {
    public final Person choreographer;

    public Ballet(ArrayList<Actor> listOfActors, Director director, int duration,
                  String title, Person musicAuthor, String librettoText, Person choreographer) {
        super(listOfActors, director, duration, title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Ballet{" +
                "listOfActors=" + listOfActors +
                '}';
    }
}
