import java.util.ArrayList;

public class Show {
    protected ArrayList<Actor> listOfActors;
    protected final Director director;
    protected final int duration;
    protected final String title;

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

    public void actorReplacement(Actor addedActor, String previousActorSurname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(previousActorSurname)) {
                listOfActors.remove(actor);
                listOfActors.add(addedActor);
                return;
            }
        }
        System.out.println(previousActorSurname + " нет в этом спектакле");
    }

    public void printListOfActors() {
        System.out.println("Список актеров спектакля " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

}


