package animals;

public class Pies extends Animal{
    @Override
    public void sound() {
        System.out.println("Pies szczeka");
        sayHello();
        System.out.println("Ilość nóg "+legs);
    }
}
