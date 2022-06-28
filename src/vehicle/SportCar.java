package vehicle;

public class SportCar extends Car{
    @Override
    public int drive (int time){
        int distance = time * 100;
        System.out.println(distance+" km/h");
        return distance;
    }

}
