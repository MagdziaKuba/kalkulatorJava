import drivers.NoValidBrowserName;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsCheck {
    /*Pobierz wiek od użytkownika,
    * jeżeli będzie mniejszy od zera to wyrzuć wyjątek InvalidAgeException
    * jeżeli mamy 18 >= to wypisz, że pełnoletni*/
    public static void main(String[] args) throws InvalidAgeException {

        Scanner scaner=new Scanner(System.in);
        System.out.println("Podaj wiek.");
        int wiek=scaner.nextInt();
        if((wiek>0)&&(wiek<18)){
            System.out.println("Masz od 1 do 18 lat.");
        }else if(wiek>=18){
            System.out.println("Jestem pełnoletni");
        }else{
            throw new InvalidAgeException("Age is not valid");
        }



    }
}
