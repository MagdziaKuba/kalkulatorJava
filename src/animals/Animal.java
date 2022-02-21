package animals;

public abstract class Animal {
    //klasa abstrakcyjna

    public final static int legs=4;

    public abstract void sound();
    public void sayHello(){
        System.out.println("Animal- dźwięk");
    }
}
