package animals;

public class Kot extends Animal{
    @Override
    public void sound() {
        System.out.println("Kot miałczy");
        sayHello();
        System.out.println("Ilość nóg "+legs);
    }
}
