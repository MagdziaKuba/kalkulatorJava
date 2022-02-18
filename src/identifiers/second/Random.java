package identifiers.second;

import identifiers.first.Parent;

public class Random {
    /*
    * Klasa w INNEJ paczce nie ma dostępu do pól i metod private,default,protected*/
    public void test(){
        Parent parent=new Parent();

        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);

        parent.firstMetod();
        //parent.secondMetod();
        //parent.thirdMetod();
        //parent.fourthMetod();
    }
}
