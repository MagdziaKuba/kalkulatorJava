public class MetodyTest {
    public static void main(String[] args) {
        Metody metody= new Metody();
        metody.policzWynik();
        int result=metody.wypiszWynik();
        int result2=result *2;
        System.out.println("result 1: "+result);
        System.out.println("result 2: "+result2);

    }
}
