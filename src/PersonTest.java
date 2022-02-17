public class PersonTest {
    public static void main(String[] args) {
        MathTeacher nauczyciel= new MathTeacher();
        nauczyciel.name="Jola";
        nauczyciel.age=29;
        nauczyciel.walk();
        nauczyciel.eat();
        nauczyciel.teachMatch();
        nauczyciel.school="Uniwersytet";
        nauczyciel.sayHello();



        Footballer gracz= new Footballer();
        gracz.name="Tom";
        gracz.age=31;
        gracz.walk();
        gracz.eat();
        gracz.playFootball();
        gracz.sayHello();
    }
}
