public class User {
    public String username;
    public String password;
    //konstruktor
    public User(){
        System.out.println("Wykonał się konstruktor");
    }
    public User(String user){
        System.out.println("Wykonał się konstruktor dla "+user);
        username=user;
    }
    public void sayHello(){
        System.out.println("Hello "+username);
    }
}
