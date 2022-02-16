public class StudentTest {
    /*
    * Stworzyć 3 obiekty klasy student.
    * Przypisać wartości do pól.
    * Stworzyć tablice i dodać studentów do tablicy.
    *
    * Przejdz przez studentów w tablicy i wywołaj wszystkie 4 metody.*/
    public static void main(String[] args) {
        StudentRef student1=new StudentRef();
        student1.imie="Maria";
        student1.nazwisko="Potocka";
        student1.nick="MPot";
        student1.email="mp@gmail.com";
        student1.numerIndeksu=1223;

        /*student1.przedstawSie();
        student1.zalogujSie();
        student1.podajNrIndeksu();
        student1.podajEmail();*/


        StudentRef student2=new StudentRef();
        student2.imie="Jan";
        student2.nazwisko="Płomyk";
        student2.nick="JanP";
        student2.email="JanP@gmail.com";
        student2.numerIndeksu=1333;

        StudentRef student3=new StudentRef();
        student3.imie="Karol";
        student3.nazwisko="Pigwa";
        student3.nick="Pig";
        student3.email="kpig@gmail.com";
        student3.numerIndeksu=1553;


        StudentRef[] studenci= new StudentRef[3];
        studenci[0]=student1;
        studenci[1]=student2;
        studenci[2]=student3;


        for(int i=0; i< studenci.length;i++){
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajNrIndeksu();
            studenci[i].podajEmail();
        }


    }




}
