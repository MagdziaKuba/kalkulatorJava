public class AutoTest {
    public static void main(String[] args) {
        Auto mercedes=new Auto();
        mercedes.marka= "Mercedes";
        mercedes.model="Klasa s";
        mercedes.rok=1992;
        mercedes.przebieg=1230;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();
    }
}
