package day40;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    static void main() {
        try(FileWriter myWriter = new FileWriter("src/myfolder/file1.txt", true)){
            myWriter.write("\nAppended text");
            System.out.println("Successfully Appended to the file");
        }catch (IOException ex){
            System.out.println("Error occurred");
            ex.printStackTrace();
        }
    }
}
