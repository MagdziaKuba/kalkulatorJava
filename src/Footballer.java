public class Footballer extends Person{
    public  String club;

    public Footballer(){}

    public Footballer(String name, int age, String club) {
        //wywołuje konstruktor klasy nadrzędnej-pierwszy
        super(name, age);
        this.club=club;
        System.out.println("Jestem konstruktorem Footballer");
    }

    public void playFootball(){
        System.out.println("Gracz gra.");
    }

    public  void  sayHello(){
        System.out.println("Gracz mówi Hej!");
        System.out.println("Mam lat: "+age);
    }
}
