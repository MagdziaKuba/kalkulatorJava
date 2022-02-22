package listy;

import docks.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String > names=new ArrayList<>();
        //automatycznie powiękaszna przy dodawaniu kolejnych elementów
        names.add("Kasia");
        names.add("Michał");
        names.add("Mateusz");
        names.add("Mateusz");

        System.out.println(names.get(2));
        System.out.println(names.get(3));

        System.out.println(names.indexOf("Mateusz"));
        System.out.println(names.lastIndexOf("Mateusz"));

        System.out.println(names.contains("Magda"));
        System.out.println(names.contains("Mateusz"));

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        List<Integer> numbers=new LinkedList<>();
        numbers.add(1);//automatycznie konwertowany z int na Integer
        numbers.add(3);
        numbers.add(8);
        numbers.add(10);

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(8));
        System.out.println(numbers.lastIndexOf(10));
        System.out.println(numbers.contains(10));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        List<String> diffNames=new ArrayList<>();
        diffNames.addAll(names);

        List<PdfDocument> pdfDocuments=new ArrayList<>();
        pdfDocuments.add(new PdfDocument());

        for(int i =0; i<names.size();i++){
            System.out.println(names.get(i));
        }

        for(String name:names){
            System.out.println(name);
        }





    }
}
