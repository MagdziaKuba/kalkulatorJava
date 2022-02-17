public class MathTeacher extends Person{
    public  String school;

    public void teachMatch(){
        System.out.println("Nauczyciel uczy.");
    }

    public  void  sayHello(){
        System.out.println("Nauczyciel mówi Hej! Uczę w "+school);
        System.out.println("Mam lat: "+age);
    }
}
