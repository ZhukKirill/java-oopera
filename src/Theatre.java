import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actorMichael = new Actor("Michael", "Imperioli", Gender.MALE, 180);
        Actor actorTony = new Actor("Tony", "Sirico", Gender.MALE, 175);
        Actor actorSteve = new Actor("Steve", "Schirripa", Gender.MALE, 187);
        Actor forChekActorMichael = new Actor("Michael", "Imperioli", Gender.MALE, 180);
        Director dirJames = new Director("James", "Gandolfini", Gender.MALE,
                50);
        Director dirSteven = new Director("Steven", "Zandt", Gender.MALE,
                45);
        Person choreogrLorraine = new Person("Lorraine", "Bracco", Gender.FEMALE);
        Person musicAuthorDominic = new Person("Dominic", "Chianese", Gender.MALE);

        Show usualPerformance = new Show(new ArrayList<Actor>(), dirSteven, 120, "Forest");
        Ballet ballet = new Ballet(new ArrayList<Actor>(), dirJames, 90, "Lake", musicAuthorDominic,
                "libretto for ballet", choreogrLorraine);
        Opera opera = new Opera(new ArrayList<Actor>(), dirSteven, 104, "Sea", musicAuthorDominic,
                "libretto for opera", 10);

        usualPerformance.addActor(actorMichael);
        usualPerformance.addActor(actorSteve);

        ballet.addActor(actorSteve);
        ballet.addActor(actorTony);

        opera.addActor(actorMichael);
        opera.addActor(actorTony);
        opera.addActor(forChekActorMichael);

        usualPerformance.printListOfActors();
        ballet.printListOfActors();
        opera.printListOfActors();

        ballet.actorReplacement(actorMichael, "Schirripa");
        System.out.println();
        ballet.printListOfActors();

        System.out.println();
        opera.actorReplacement(actorMichael, "Schirripa");

        System.out.println();
        ballet.printLibrettoText();
        opera.printLibrettoText();
    }
}
