package practice;

public class TurfManager {
       static Turf turf;
    public static Turf bookTurf(int choice){
        switch (choice){
            case 1: turf = new CricketTurf();
            break;
            case 2: turf = new Footballturf();
            break;
            case 3: System.exit(404);
            default: turf = null;
        }
        return turf;
    }
}
