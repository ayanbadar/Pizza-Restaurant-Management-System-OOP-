package Domino;

public class Takeaway extends Customer{
    String name;
    public Takeaway(int invoice, String name) {
        super(invoice);
        this.name = name;
    }

}
