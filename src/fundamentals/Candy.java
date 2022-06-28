package fundamentals;

public class Candy {
    private String name;
    private int price;
    private String quantity;

    public Candy(String name,int price,String quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public Candy(){

    }
    public void setName (String name){
        this.name=name;
    }
    public void setPrice (int price){
        this.price=price;
    }
    public void setQuantity (String quantity){
        this.quantity=quantity;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getQuantity(){
        return quantity;
    }
}

