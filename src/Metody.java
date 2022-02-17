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


    public void policzWynikParam(int numer){
        System.out.println("Liczy wynik.");
        int result=0;
        for(int i=0; i<numer;i++){
            result=result+i;
        }
        System.out.println("Rezultat to: "+result);

    }

    public void add(int numer1, int number2){
        int wynik=numer1+number2;
        System.out.println("Wynik dodawania to: "+wynik);

    }

}
