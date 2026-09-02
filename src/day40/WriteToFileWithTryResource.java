package day40;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileWithTryResource {
    static void main() {

        try(FileWriter myWriter = new FileWriter("src/myfolder/file2.txt")){
            myWriter.write("Hello From try resources");
            System.out.println("Wrriten to file successfully");
        }catch (IOException ex){
            System.out.println("something went wrong");
            ex.printStackTrace();
        }
    }
}
