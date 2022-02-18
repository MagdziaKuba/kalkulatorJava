public class Person {
    public String name;
    public int age;

    public Person(){}

    public Person(String name, int age){
        System.out.println("Jestem konstruktorem Person");
        this.name=name;
        this.age=age;
    }

    public void eat(){
        System.out.println("Człowiek je.");
    }

    public void walk(){
        System.out.println("Człowiek idzie.");
    }
}
