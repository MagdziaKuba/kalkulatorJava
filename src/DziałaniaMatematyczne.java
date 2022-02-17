public class DziałaniaMatematyczne {
    public void add(int numer1, int number2){
        int wynik=numer1+number2;
        System.out.println("Wynik dodawania to: "+wynik);

    }

    public void subtraction(int numer1, int number2){
        int wynik=numer1-number2;
        System.out.println("Wynik odejmowania to: "+wynik);

    }

    public void multiplication(int numer1, int number2){
        int wynik=numer1*number2;
        System.out.println("Wynik mnożenia to: "+wynik);

    }
    public void division(int numer1, int number2){
        float wynik=numer1/number2;
        System.out.println("Wynik dzielenia to: "+wynik);

    }
    public void mod(int numer1, int number2){
        int wynik=numer1%number2;
        System.out.println("Wynik modulo to: "+wynik);

    }
}
