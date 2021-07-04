
import java.util.Scanner;

public class ThuisTeam extends Team{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void nameTeam(){
        System.out.print("Voer hier de naam van het thuis team in: ");
        naamT = scanner.nextLine();
    }

    @Override
    public void aantalSpelers(){
        System.out.print("Vul hier de aantal spelers in: ");
        no = scanner.nextInt();

        for (int i = 0; i < no; i++) {
            System.out.print("Voornaam van speler " + (i+1) + ": ");
            naamSpelersT.add(scanner.next());
        }
        System.out.println("Thuis team succesvol toegevoegd!");
    }

    public String getNaamT() {
        return naamT;
    }
}
