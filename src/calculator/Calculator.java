package calculator;

public class Calculator {
    private String name;
    private String color;
    private int weight;
    private int price;
    public Calculator(){

    }
    public Calculator(String name,int price,String color) {
    this.name=name;
    this.price=price;
    this.color=color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public int multiply(int a,int b){
        int sum = a*b;
        return sum;
    }
    public int cube(int res){
        int cube = (int) Math.pow(res,3);
        return cube;
    }
    public double simpleInterest(double principle,double rate,double time){
        double interest=(double) principle * rate * time / 100;
        return interest;
    }
}