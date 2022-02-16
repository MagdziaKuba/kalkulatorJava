public class Auto {
    //pola
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    //metody
    public void jedz(){
        System.out.println("Jedzie!");
    }
    public void hamuj(){
        System.out.println("Hamuje!");
    }

    public void info(){
        System.out.println("Marka "+marka);
        System.out.println("model "+model);
        System.out.println("rok produkcji "+rok);
        System.out.println("przebieg "+przebieg);


    }


}
