public class PersonTest {
    public static void main(String[] args) {

        MathTeacher nauczyciel2=new MathTeacher("Aleksandra",34,"AGH");
        nauczyciel2.sayHello();

        MathTeacher nauczyciel= new MathTeacher();
        nauczyciel.name="Jola";
        nauczyciel.age=29;
        nauczyciel.walk();
        nauczyciel.eat();
        nauczyciel.teachMatch();
        nauczyciel.school="Uniwersytet";
        nauczyciel.sayHello();


        Footballer gracz2=new Footballer("Tadeusz",33,"Titanic");
        gracz2.walk();
        gracz2.eat();
        gracz2.playFootball();
        gracz2.sayHello();

        Footballer gracz= new Footballer();
        gracz.name="Tom";
        gracz.age=31;
        gracz.walk();
        gracz.eat();
        gracz.playFootball();
        gracz.sayHello();
    }
}
