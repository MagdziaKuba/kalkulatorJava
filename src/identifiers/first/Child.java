package identifiers.first;

public class Child extends Parent{
    //klasa potomna w tej samej paczce nie ma dostępu do private
    public void testIdenti(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //brak dostępu do pola private
        //System.out.println(fourth);

        firstMetod();
        secondMetod();
        thirdMetod();
        //brak dostępu do metody private
        //fourthMetod();
    }
}
