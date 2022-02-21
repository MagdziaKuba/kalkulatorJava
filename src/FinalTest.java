public class FinalTest {
    public static void main(String[] args) {
        //nie można zmienić wartości zmiennej która jest final
        final int x=2;

        final Person person= new Person("Tim", 29);
        person.age=25;
        //nie możemy przypisać nowej osoby
        //do pól final nie da się nadpisać nową wartością
        //do obiektu nie możemy przypisać nowego obiektu

    }
}
