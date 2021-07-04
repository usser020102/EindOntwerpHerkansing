import java.util.Scanner;

public class Login {
    private Startscherm enters;
    private Users user;
    Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;

    public Login(){
        this.enters = new Startscherm();
        this.user = new Users();
    }

    public boolean Inloggen(String un, String pw){
        System.out.println("Welkom!");
        System.out.print("Gebruikersnaam: ");
        username = scanner.nextLine();
        System.out.print("Wachtwoord: ");
        password = scanner.nextLine();

        for(int i = 0; i < user.singleton.users.size(); i++) {

            if (username.equals(user.singleton.users.get(i).getName()) && password.equals(user.singleton.users.get(i).getPw())) {
                enters.Menu();
            } else if (username.equals("admin")) {
                System.out.println("Wachtwoord onjuist!");
                Inloggen(un, pw);
            } else if (password.equals("abc123")) {
                System.out.println("Gebruikersnaam onjuist!");
                Inloggen(un, pw);
            } else {
                System.out.println("Onjuiste gebruikersnaam en wachtwoord!");
                Inloggen(un, pw);
            }
        }
        return false;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}