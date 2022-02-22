package interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {
    //zlicza wystąpienie cyfr w tablicy
    //elastyczna
    //działająca na innych tablicach
    public static void main(String[] args) {
        liczWystąpienia(new int[] {1,2,3,4,1,2,3,4});

    }
    public static void liczWystąpienia(int[] numbers){
        Map<Integer,Integer> occurences=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(occurences.containsKey(numbers[i])){
                Integer value=occurences.get(numbers[i]);
                //zlicza
                occurences.put(numbers[i],value+1);
            }else{
                occurences.put(numbers[i],1);
            }
        }


        for (Integer key:occurences.keySet()){
            System.out.println("Liczba "+key+" występuje "+occurences.get(key));
        }
        System.out.println("Ilość elementów w mapie "+occurences.size());
    }
}
