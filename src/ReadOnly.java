public class ReadOnly {
    private String  name="Imię";
    //getter, pole tylko do odczytu
    public String getName(){
        return name +" jest ok.";
    }
    //setter, metody do ustawienia wartości pól prywatnych
    public void setName(String name){
        this.name=name;
    }
}
