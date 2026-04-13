import java.util.ArrayList;

public class Ballet extends MusicalShow {
    protected final Person choreographer;

    public Ballet(ArrayList<Actor> listOfActors, Director director, int duration,
                  String title, Person musicAuthor, String librettoText, Person choreographer) {
        super(listOfActors, director, duration, title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

}
