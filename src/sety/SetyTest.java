package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {
    public static void main(String[] args) {
        //zbiór
        Set<String> fruits=new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");//w zbiorach nie istnieją duplikaty

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege=new HashSet<>();
        vege.add("potatoes");
        vege.addAll(fruits);
        System.out.println(vege.size());

        //przechodzenie przez zbiór
        for(String fruit:fruits){
            System.out.println(fruit);
        }


    }
}
