public class Metody {
    public void policzWynik(){
        System.out.println("Liczy wynik.");
        int result=0;
        for(int i=0; i<100;i++){
            result++;
        }
        System.out.println("Rezultat to: "+result);
    }

    public int wypiszWynik(){
        System.out.println("Liczy wynik.");
        int result=0;
        for(int i=0; i<100;i++){
            result++;
        }
        System.out.println("Rezultat to: "+result);
        return result;
    }

}
