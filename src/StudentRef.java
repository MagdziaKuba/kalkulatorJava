public class StudentRef {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    //pole statyczne
    public static String nazwaUczelni="UMCS";

    public void przedstawSie(){
        System.out.println("Nazywam się "+imie+" "+nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguję się jako "+nick);
    }
    public void podajNrIndeksu(){
        System.out.println("Mój numer indeksu to:  "+numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Mój email to:  "+email);
    }

    //metoda statyczna
    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to UMCS.");
    }
}
