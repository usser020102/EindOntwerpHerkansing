
public class Main {

    public static void main(String[] args) {
        Login start = new Login();
        Users geb = new Users("admin", "abc123", "club@hbvthejumpers.nl");
        FAQ b = new FAQ("1) Hoe moet ik spelers toevoegen in een sheet?");
        FAQ c = new FAQ("2) Hoe weet ik hoeveel spelers ik moet toevoegen in een team?");
        FAQ d = new FAQ("3) Als ik optie 2 kies, dan krijg ik een melding dat the thuis- en uitteam leeg zijn!");
        FAQ e = new FAQ("4) Mijn vraag zit er niet tussen.");

        geb.addUsers(geb);
        b.addQuestion(b);
        c.addQuestion(c);
        d.addQuestion(d);
        e.addQuestion(e);

        start.Inloggen("test", "test");
    }
}

