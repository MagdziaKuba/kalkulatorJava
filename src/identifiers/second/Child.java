package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {
    //klasa potomna w INNEJ paczce nie ma dostępu do private
    //oraz brak dostępu do default
    public void testId() {
        System.out.println(first);
        //brak dostępu do default
        //System.out.println(second);
        System.out.println(third);

        firstMetod();
        //brak dostępu do default
        //secondMetod();
        thirdMetod();
    }

}
