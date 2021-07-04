public class Users {
    private String name;
    private String pw;
    private String email;
    Singleton singleton;
    private Login login;

    public Users(String name, String pw, String email){
        singleton = singleton.getInstance();
        this.name = name;
        this.pw = pw;
        this.email = email;
        this.login = new Login();
    }

    public Users(){}

    public void addUsers(Users users){
        singleton.users.add(users);
    }

    public void printData(){
        for (int i = 0; i < singleton.users.size(); i++){
                System.out.println();
                System.out.println("Gebruikersnaam: " + singleton.users.get(i).getName());
                System.out.println("Wachtwoord: " + singleton.users.get(i).getPw());
                System.out.println("Email: " + singleton.users.get(i).getEmail());
                System.out.println();

        }
    }


    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    public String getEmail() {
        return email;
    }

}
