package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("zapisywanieDoPliku.txt");
        writer.write("Tekst zapisał się do pliku.");
        writer.close();
    }
}
