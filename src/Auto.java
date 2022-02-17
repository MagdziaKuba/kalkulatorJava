public class Auto {
    //pola
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public Auto(){
        this.marka= "None";
        this.model="none";
        this.rok=0;
        this.przebieg=0;
    }
    public Auto(String marka,String model,int rok,int przebieg){
        this.marka= marka;
        this.model=model;
        this.rok=rok;
        this.przebieg=przebieg;
    }

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
