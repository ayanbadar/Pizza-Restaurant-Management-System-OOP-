package Domino;

public class Pizza {
    int quantity;
    public String size;
    public String crust;
    public String choice;
    public String flavor;

    Pizza(String size){

    }

    public Pizza(int quantity, String size, String crust, String choice, String flavor) {
        this.quantity = quantity;
        this.size = size;
        this.crust = crust;
        this.choice = choice;
        this.flavor = flavor;

    }

    public String  getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
}

class Veg extends Pizza{

    public Veg(int quantity, String size, String crust, String choice, String flavor) {
        super(quantity, size,  crust, choice, flavor);
    }



}
class NonVeg extends Pizza {
    String meatChoice;

    public NonVeg(int quantity, String size, String crust, String choice, String meatChoice, String flavor) {
        super(quantity, size, crust, choice, flavor);
        this.meatChoice = meatChoice;
    }
}