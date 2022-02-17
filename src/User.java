public class User {
    public String username;
    public String password;
    //konstruktor
    public User(){
        System.out.println("Wykonał się konstruktor");
    }
    public User(String username){
        System.out.println("Wykonał się konstruktor dla "+username);
        this.username=username;
        password="nie powiem";
    }
    public User(String username, String pass){
        this.username=username;
        password=pass;
    }
    public void sayHello(){
        System.out.println("Hello "+username+" hasełko moje to "+password);
    }
}
