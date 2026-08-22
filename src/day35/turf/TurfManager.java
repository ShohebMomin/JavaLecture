package day35.turf;

public class TurfManager{
    static Turf turf;
    public static Turf bookTurf(int choice){
        switch (choice){
            case 1: turf = new CricketTurf();
                    break;
            case 2: turf = new FootballTurf();
                    break;
            default: turf=null;
        }
        return turf;
    }
}
