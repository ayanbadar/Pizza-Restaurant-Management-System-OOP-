package Domino;

public class Delivery extends Customer{
    String name;
    String contactNumber;
    String address;

    public Delivery(int invoice, String name, String contactNumber, String address) {
        super(invoice);
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }
}
