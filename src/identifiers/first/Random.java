package identifiers.first;

public class Random {
    //klasa w tej samej paczce nie ma dostępu do private
    //to nie jest klasa potomna
    public void test(){
        Parent parent=new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth);

        parent.firstMetod();
        parent.secondMetod();
        parent.thirdMetod();
        //parent.fourthMetod();
    }
}
