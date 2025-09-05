package Domino;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Receptionist extends Employee {
    int r_id;
    private String username;
    private String password;


    Scanner sc = new Scanner(System.in);

    public Receptionist(String name, int r_id) {
        super(name);
        this.r_id = r_id;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    void salary() {
        int salary;
        salary = 30000;
    }
    public void deliveryOrder(ArrayList<Delivery> del1,ArrayList <Veg> v1,ArrayList<NonVeg> n1) {
        try {
            FileWriter f = new FileWriter("D:\\OOPlab\\Domino (1)\\Domino\\customer.txt");
            try {
                System.out.println("Enter Customer name:");
                String name = sc.next();
                f.write(name + "\t");
                System.out.println("Enter Customer contact number:");
                String contactNumber = sc.next();
                f.write(contactNumber + "\t");
                System.out.println("Enter Customer address:");
                String address = sc.next();
                f.write(address);
                del1.add(new Delivery(del1.size() + 10001, name, contactNumber, address));
                f.write(name+"\t"+contactNumber+"\t"+address );
            }
            finally {
                f.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

            System.out.println("Enter quantity of pizza:");
            int quantity = sc.nextInt();
            System.out.println("Enter size of Pizza:\nSmall\nMedium\nLarge");
            String size = sc.next();
            System.out.println("Enter Crust\n1.Pan\n2.Hand Tossed\n3.Italian Thin\n4.Crunchy Thin");
            String crust = sc.next();
            System.out.println("VEG or NONVEG");
            String choice = sc.next();


            if (choice.equals("veg")) {
                System.out.println("1.PACIFIC VEGIE\n2.HAWAIIAN PIZZA\n3.MARGHERITA");
                String flavor = sc.next();
                v1.add(new Veg(quantity, size, crust, choice, flavor));
            } else if (choice.equals("nonveg")) {
                System.out.println("Chicken OR Beef");
                String meatChoice = sc.next();
                if (meatChoice.equals("chicken")) {
                    System.out.println("1.TEX-MEX\n2.CHICKEN TIKKA\n3.HOT AND SPICY\n4.TANDOORI HOT\n5.LEGEND BBQ");
                    String chicflavor = sc.next();
                    n1.add(new NonVeg(quantity, size, crust, choice, meatChoice, chicflavor));
                } else if (meatChoice.equals("beef")) {
                    System.out.println("1.PEPPERONI PASSION\n2.PEPPERONI HOT\n3.HAWAIIAN.");
                    String beefflavor = sc.next();
                    n1.add(new NonVeg(quantity, size, crust, choice, meatChoice, beefflavor));
                }
            } else {
                System.out.println("Invalid");
            }

        }
        public void takeawayOrder (ArrayList < Takeaway > t1, ArrayList < Veg > v1, ArrayList < NonVeg > n1){
            System.out.println("Enter Customer name:");
            String name = sc.next();
            t1.add(new Takeaway(t1.size() + 00001, name));
            System.out.println("Enter quantity of pizza:");
            int quantity = sc.nextInt();
            System.out.println("Enter size of pizza:\nSmall\nMedium\nLarge");
            String size = sc.next();
            System.out.println("Enter Crust\n1.Pan\n2.Hand Tossed\n3.Italian Thin\n4.Crunchy Thin");
            String crust = sc.next();
            System.out.println("VEG or NONVEG");
            String choice = sc.next();


            if (choice.equals("veg")) {
                System.out.println("1.PACIFIC VEGIE\n2.HAWAIIAN PIZZA\n3.MARGHERITA");
                String flavor = sc.next();
                v1.add(new Veg(quantity, size, crust, choice, flavor));
            } else if (choice.equals("nonveg")) {
                System.out.println("Chicken OR Beef");
                String meatChoice = sc.next();
                if (meatChoice.equals("chicken")) {
                    System.out.println("1.TEX-MEX\n2.CHICKEN TIKKA\n3.HOT AND SPICY\n4.TANDOORI HOT\n5.LEGEND BBQ");
                    String chicflavor = sc.next();
                    n1.add(new NonVeg(quantity, size, crust, choice, meatChoice, chicflavor));
                } else if (meatChoice.equals("beef")) {
                    System.out.println("1.PEPPERONI PASSION\n2.PEPPERONI HOT\n3.HAWAIIAN.");
                    String beefflavor = sc.next();
                    n1.add(new NonVeg(quantity, size, crust, choice, meatChoice, beefflavor));
                }
            } else {
                System.out.println("Invalid");
            }


        }
    }

