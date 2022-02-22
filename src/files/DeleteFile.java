package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("test.txt");
        //usuwa plik i zwraca boolean
        if(file.delete()){
            System.out.println("Usuneliśmy plik");
        }else{
            System.out.println("nie udało sie usunąć pliku");
        }
    }
}
