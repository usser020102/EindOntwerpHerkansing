
import java.util.Scanner;

public class UitTeam extends Team{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void nameTeam(){
        System.out.print("Voer hier de naam van het uit team in: ");
        naamU = scanner.nextLine();
        System.out.print("Vul hier de aantal spelers in: ");
        no = scanner.nextInt();

    }

    @Override
    public void aantalSpelers(){
        for (int i = 0; i < no; i++) {
            System.out.print("Voornaam van speler " + (i+1) + ": ");
            naamSpelersU.add(scanner.next());
        }
        System.out.println("Uit team succesvol toegevoegd!");

    }

}
