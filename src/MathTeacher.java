public class MathTeacher extends Person{
    public  String school;
    public MathTeacher(){}

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school=school;
        System.out.println("Jestem konstruktorem MathTeacher");
    }

    public void teachMatch(){
        System.out.println("Nauczyciel uczy.");
    }

    public  void  sayHello(){
        System.out.println("Nauczyciel mówi Hej! Uczę w "+school);
        System.out.println("Mam lat: "+age);
    }
}
