import java.util.ArrayList;

public class Show {
    public ArrayList<Actor> listOfActors;
    public final Director director;
    public final int duration;
    public final String title;

    public Show(ArrayList<Actor> listOfActors, Director director, int duration, String title) {
        this.listOfActors = listOfActors;
        this.director = director;
        this.duration = duration;
        this.title = title;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println(actor + " уже в спектакле");
        } else {
            listOfActors.add(actor);
        }
    }

    public void actorReplacement(Actor addedActor, Actor removedActor) {
        if (listOfActors.contains(removedActor)) {
            listOfActors.remove(removedActor);
            listOfActors.add(addedActor);
        } else {
            System.out.println(removedActor + " нет в этом спектакле");
        }
    }

    @Override
    public String toString() {
        return "UsualPerformance={" +
                "listOfActors=" + listOfActors +
                '}';
    }
}
