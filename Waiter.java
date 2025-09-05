package Domino;

import java.util.ArrayList;
import java.util.Scanner;


public class Waiter extends Employee {
    int w_id;
    Scanner sc = new Scanner(System.in);

    public Waiter(String name, int w_id) {
        super(name);
        this.w_id = w_id;
    }

    @Override
    void salary() {
        int salary;
        salary = 25000;
    }

    public void order(ArrayList<DineIn> dine1,ArrayList <Veg> v1,ArrayList<NonVeg> n1) {
        dine1.add(new DineIn(dine1.size()+20001));
        System.out.println("Enter quantity of pizza:");
        int quantity = sc.nextInt();
        System.out.println("Enter size of pizza you would like:\nSmall\nMedium\nLarge");
        String size = sc.next();
        System.out.println("Enter Crust\n1.Pan\n2.Hand Tossed\n3.Italian Thin\n4.Crunchy Thin");
        String crust = sc.next();
        System.out.println("VEG or NONVEG");
        String choice = sc.next();


        if (choice.equals("veg")) {
            System.out.println("1.PACIFIC VEGIE\n2.HAWAIIAN PIZZA\n3.MARGHERITA");
            String flavor = sc.next();
            v1.add(new Veg(quantity, size,crust,choice,flavor));
        } else if (choice.equals("nonveg")) {
            System.out.println("Chicken OR Beef");
            String meatChoice = sc.next();
            if (meatChoice.equals("chicken")) {
                System.out.println("1.TEX-MEX\n2.CHICKEN TIKKA\n3.HOT AND SPICY\n4.TANDOORI HOT\n5.LEGEND BBQ");
                String chicflavor = sc.next();
                n1.add(new NonVeg(quantity,size,crust,choice,meatChoice,chicflavor));
            } else if (meatChoice.equals("beef")) {
                System.out.println("1.PEPPERONI PASSION\n2.PEPPERONI HOT\n3.HAWAIIAN.");
                String beefflavor = sc.next();
                n1.add(new NonVeg(quantity,size,crust,choice,meatChoice,beefflavor));
            }
        } else {
            System.out.println("Not Available");
        }


    }

}