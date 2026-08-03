import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
     try {
        readFile();
     } catch (Exception e) {
        System.out.println(e.getMessage());
     }  
        
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
    }

}
