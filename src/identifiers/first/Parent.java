package identifiers.first;

public class Parent {
    public String first="public";
    String second="default";
    protected String third="protected";
    private String fourth="private";

    public void firstMetod(){
        System.out.println("Public method");
    }
    void secondMetod(){
        System.out.println("default method");
    }
    protected void thirdMetod(){
        System.out.println("protected method");
    }
    private void fourthMetod(){
        System.out.println("private method");
    }

    public void testIdentifiers(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        firstMetod();
        secondMetod();
        thirdMetod();
        fourthMetod();
    }
}
