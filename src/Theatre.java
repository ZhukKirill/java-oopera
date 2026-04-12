import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actorMichael = new Actor("Michael", "Imperioli", Person.Gender.MALE, 180);
        Actor actorTony = new Actor("Tony", "Sirico", Person.Gender.MALE, 175);
        Actor actorSteve = new Actor("Steve", "Schirripa", Person.Gender.MALE, 187);
        Actor forChekActorMichael = new Actor("Michael", "Imperioli", Person.Gender.MALE, 180);
        Director dirJames = new Director("James","Gandolfini", Person.Gender.MALE,
                50);
        Director dirSteven = new Director("Steven", "Zandt", Person.Gender.MALE,
                 45);
        Person choreogrLorraine = new Person("Lorraine", "Bracco", Person.Gender.FEMALE);
        Person musicAuthorDominic = new Person("Dominic","Chianese", Person.Gender.MALE);

        Show usualPerformance = new Show(new ArrayList<Actor>(), dirSteven, 120, "Forest" );
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

        System.out.println(usualPerformance);
        System.out.println(ballet);
        System.out.println(opera);

        ballet.actorReplacement(actorMichael, actorSteve);
        System.out.println();
        System.out.println(ballet);

        System.out.println();
        opera.actorReplacement(actorMichael, actorSteve);

        System.out.println();
        ballet.printLibrettoText();
        opera.printLibrettoText();
    }
}
