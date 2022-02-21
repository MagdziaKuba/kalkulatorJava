import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {


    public static void main(String[] args){
        try {
            System.out.println("Before reading file");
            readFile("/src/kjsdsdjslkcjsdl.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) {
            System.out.println("wyjatek został złapany");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("closing file.");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(path);
    }
}
