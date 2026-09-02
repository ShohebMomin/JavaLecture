package day40;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static void main() {
        try {
            FileWriter fsWritter = new FileWriter("src/myfolder/file1.txt");
            fsWritter.write("Hello world");
            fsWritter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException ex){
            System.out.println("Something went wrong");
            ex.printStackTrace();
        }
    }
}
