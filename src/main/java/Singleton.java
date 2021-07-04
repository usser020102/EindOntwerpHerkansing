import java.util.ArrayList;

public class Singleton {
    private static Singleton instance;

    public static ArrayList<Users> users = new ArrayList<>();

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
