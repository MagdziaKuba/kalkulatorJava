package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file=new File("zapisywanieDoPliku.txt");
        //zwraca boolean
        if(file.createNewFile()){
            System.out.println("Stworzono nowy plik");
        }else{
            System.out.println("Plik już istnieje");
        }
    }
}
