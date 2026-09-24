package assesment.librarybooksbysections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Book> javaBooks = new ArrayList<>();
        List<Book> pythonBooks = new ArrayList<>();
        List<Book> webBooks = new ArrayList<>();

        Book effectiveJava = new Book(101,"Effective Java","Joshua Bloch", 850 );
        Book headFirstJava = new Book(102,"Head First Java","JKathy Sierra", 750 );
        Book theCompleteReference = new Book(103,"The Complete Reference","Joshua Bloch", 850 );
        javaBooks.add(effectiveJava);
        javaBooks.add(headFirstJava);
        javaBooks.add(theCompleteReference);

        Book pythonCrashCourse = new Book(201, "Python Crash Course", "Eric Matthes", 700);
        Book automateTheBoringStuffWithPython = new Book(202, "Automate the Boring Stuff with Python", "Al Sweigart", 650);
        Book learningPython = new Book(203, "Learning Python", "Mark Lutz", 900);
        pythonBooks.add(pythonCrashCourse);
        pythonBooks.add(automateTheBoringStuffWithPython);
        pythonBooks.add(learningPython);


        Book htmlAndCss = new Book(301, "HTML and CSS", "Jon Duckett", 800);
        Book javascriptTheGoodParts = new Book(302, "JavaScript: The Good Parts", "Douglas Crockford", 600);
        Book eloquentJavaScript = new Book(303, "Eloquent JavaScript", "Marijn Haverbeke", 750);
        webBooks.add(htmlAndCss);
        webBooks.add(javascriptTheGoodParts);
        webBooks.add(eloquentJavaScript);

        List<List<Book>> library = new ArrayList<>();
        library.add(javaBooks);
        library.add(pythonBooks);
        library.add(webBooks);
//        displayBooks(library);

        System.out.println("Java Books");
        for(int i = 0; i<javaBooks.size(); i++){
            System.out.println(javaBooks.get(i));
        }
        System.out.println("Python Books");
        for(int i = 0; i<pythonBooks.size(); i++){
            System.out.println(javaBooks.get(i));
        }
        System.out.println("Web Books");
        for(int i = 0; i<webBooks.size(); i++){
            System.out.println(javaBooks.get(i));
        }
        System.out.println("total number of sections: " + library.size());

        for(int i = 0; i<library.size(); i++){
            System.out.println("Books in section "+ (i+1) +" is " + library.get(i).size());
        }
    }
    static void displayBooks(List<List<Book>> library){
        for (int j = 0; j<library.size(); j++){
            for (int i = 0; i < library.get(j).size(); i++) {
                System.out.println(library.get(j).get(i));
            }
        }


    }
}
