package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {
    public static void main(String[] args) {
        //klucz, wartosć
        Map<Integer,String> students=new HashMap<>();
        //dodawanie do mapy
        students.put(0,"Marek");
        students.put(1,"Tomek");
        students.put(2,"Tomek");
        students.put(2,"Basia");
        //nadpisana wartość

        System.out.println(students.get(2));

        //dodawanie mapy istniejącej do nowej
        Map<Integer,String> otherStudents=new HashMap<>();
        otherStudents.putAll(students);

        //czy zawiera klucz
        System.out.println(students.containsKey(2));
        //czy zawiera wartość
        System.out.println(students.containsValue("Paweł"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());
        //students.remove(3);
        //System.out.println(students.size());

        for (Integer key:students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }

        for (String student: students.values()){
            System.out.println(student);
        }



    }
}
