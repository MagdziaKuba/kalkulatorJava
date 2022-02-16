import java.util.Scanner;
import java.lang.String;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Jak się nazywasz?");
        Scanner scanner = new Scanner(System.in);
        String imie= scanner.next();

        System.out.println("Jaki mamy dzień tygodnia?");
        String dzienTyg= scanner.next();

        switch(dzienTyg){
            case "Poniedziałek":
                System.out.println("Witaj "+imie+"! Dziś jest "+dzienTyg+"!");
                break;
            case "Wtorek":
                System.out.println("Witaj "+imie+"! Dziś jest "+dzienTyg+"!");
                break;
            case "Środa":
                System.out.println("Witaj "+imie+"! Dziś jest "+dzienTyg+"!");
                break;
            case "Czwartek":
                System.out.println("Witaj "+imie+"! Dziś jest "+dzienTyg+"!");
                break;
            case "Piątek":
                System.out.println("Witaj "+imie+"! Dziś jest "+dzienTyg+"!");
                break;
            case "Sobota":
                System.out.println("Witaj "+imie+"! Dziś jest "+dzienTyg+"!");
                break;
            case "Niedziela":
                System.out.println("Witaj "+imie+"! Dziś jest "+dzienTyg+"!");
                break;
            default:
                System.out.println("Podałeś dzień tygodnia z małej litery.");
        }

    }
}
