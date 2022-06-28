package vehicle;

public class Car {
    private String color;
    private String name;
    private int numberOfSeats;
    public Car(){

    }
    public Car(String color,String name, int numberOfSeats){
        this.color=color;
        this.name=name;
        this.numberOfSeats=numberOfSeats;
    }
    public void start(){
        System.out.println("Engine Starting");
    }
    public void stop(){
        System.out.println("Engine Stopped");
    }
    public int drive(int time){
        int distance=time*60;
        System.out.println(distance+" km/h");
        return distance;
    }
}
