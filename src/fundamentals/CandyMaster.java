package fundamentals;

public class CandyMaster {
    public static void main(String[] args) {

        Candy c1 = new Candy("Lolipop",1000,"Normal");
        Candy c2 = new Candy("Bubblegum",1500,"Rare");
        Candy c3 = new Candy("Kopiko",2000,"Super-Rare");
        Candy c4 = new Candy("Jagoan Neon",2500,"Ultra-Rare");
        System.out.println(c1.getName()+" "+c1.getPrice()+" "+c1.getQuantity()+
                "\n"+c2.getName()+" "+c2.getPrice()+" "+c2.getQuantity()+
                "\n"+c3.getName()+" "+c3.getPrice()+" "+c3.getQuantity()+
                "\n"+c4.getName()+" "+c4.getPrice()+" "+c4.getQuantity());
    }
}
