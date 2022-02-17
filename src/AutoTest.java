public class AutoTest {
    public static void main(String[] args) {
        Auto mercedes=new Auto();
        Auto opel=new Auto("Mercedes","Klasa s",1992,1230);
        Auto seat=new Auto("Seat","Klasa d");
        mercedes.marka= "Mercedes";
        mercedes.model="Klasa s";
        mercedes.rok=1992;
        mercedes.przebieg=1230;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        opel.jedz();
        opel.hamuj();
        opel.info();

        seat.jedz();
        seat.hamuj();
        seat.info();
    }
}
