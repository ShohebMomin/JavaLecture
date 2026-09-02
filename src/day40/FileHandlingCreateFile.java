package day40;

import java.io.File;
import java.io.IOException;

public class FileHandlingCreateFile {
    static void main() {
        //create new file
        File fs = new File("src/myfolder/file1.txt");
        try {
            if(fs.createNewFile()){
                System.out.println("File Created Successfully");
            }else{
                System.out.println("File already exist");
            }
        }catch (IOException ex){
            System.out.println("Something went wrong"+ ex);
        }
    }
}
