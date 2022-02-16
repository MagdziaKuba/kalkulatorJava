import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        System.out.println("Podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int wiek= scanner.nextInt();
        if(wiek<18){
            System.out.println("Przykro mi jesteś dzieckiem. Chcesz kupić cukierka zamiast piwa?");
        }else{
            System.out.println("Smacznego piwka!18");
        }
    }
}
