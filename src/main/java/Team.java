import java.util.ArrayList;

public abstract class Team {
    String naamT;
    String naamU;
    Integer no;

    ArrayList<String> naamSpelersT = new ArrayList<>();
    ArrayList<String> naamSpelersU = new ArrayList<>();

    public final void addTeam(){

        nameTeam();
        aantalSpelers();

    }

    public abstract void nameTeam();
    public abstract void aantalSpelers();

}
