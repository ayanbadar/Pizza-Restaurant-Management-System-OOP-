package Domino;

import java.util.ArrayList;
import java.util.Scanner;

public class Outlet {
    Scanner s = new Scanner(System.in);

    Manager m1 = new Manager("Ayan");
    ArrayList<Receptionist> r1 = new ArrayList<>();
    ArrayList<Waiter> w1 = new ArrayList<>();
    ArrayList<Takeaway> t1 = new ArrayList<>();
    ArrayList<Delivery> del1 = new ArrayList<>();
    ArrayList<DineIn> dine1 = new ArrayList<>();

    ArrayList<Veg> v1 = new ArrayList<>();
    ArrayList<NonVeg> n1 = new ArrayList<>();
    public void menu(){
        int role;
        do {
            System.out.println("You are using as a (press 0 to exit)");
            System.out.println("1.Manager");
            System.out.println("2.Receptionist");
            System.out.println("3.Waiter");
            role = s.nextInt();
            int choice;
            switch (role) {
                case 1:
                    System.out.println("Enter your username:");
                    String user = s.next();
                    System.out.println("Enter your password");
                    String pass = s.next();
                    if (user.equals("admin") && pass.equals("fast123")) {
                        do {
                            System.out.println("Select any of the following(press 0 to exit)");
                            System.out.println("1. Add Receptionist");
                            System.out.println("2. Add Waiter");
                            System.out.println("3. Remove Receptionist");
                            System.out.println("4. Remove Waiter");

                            choice = s.nextInt();

                            switch (choice) {
                                case 1:
                                    m1.add_receptionist(r1);
                                    m1.assign_username_and_password_to_receptionist(r1.get(r1.size() - 1));
                                    break;
                                case 2:
                                    m1.add_waiter(w1);
                                    break;
                                case 3:
                                    m1.del_Receptionist(r1);
                                    break;
                                case 4:
                                    m1.del_waiter(w1);
                                    break;
                                default:
                                    if (choice != 0) ;
                                    System.out.println("Please choose a valid option.");
                            }

                        }while (choice != 0) ;

                    }
                    else {
                        System.out.println("Sorry invalid username or password. Please try again.");
                    }
                    break;
                case 2:
                    System.out.println("Enter your username:");
                    String username = s.next();
                    System.out.println("Enter your password");
                    String password = s.next();
                    for (int i = 0; i < r1.size(); i++) {
                        if (r1.get(i).getUsername().equals(username) && r1.get(i).getPassword().equals(password)) {
                            do {
                                System.out.println("Select any of the following(press 0 to exit)");
                                System.out.println("1. Deliver Order");
                                System.out.println("2. Takeaway Order");

                                choice = s.nextInt();

                                switch (choice) {
                                    case 1:
                                        r1.get(i).deliveryOrder(del1,v1,n1);
                                        break;
                                    case 2:
                                        r1.get(i).takeawayOrder(t1,v1,n1);
                                        break;
                                    default:
                                        if(choice != 0);
                                        System.out.println("Please choose a valid option.");
                                }
                            } while (choice != 0);
                            return;
                        }
                    }
                    System.out.println("Sorry invalid username or password. Please try again.");
                    break;
                case 3:
                    System.out.println("Enter your name:");
                    String name = s.next();
                    for (int i = 0; i < w1.size(); i++) {
                        if (w1.get(i).name.equals(name)) {
                            do {
                                System.out.println("Select any of the following(press 0 to exit)");
                                System.out.println("1. Take Order");

                                choice = s.nextInt();

                                switch (choice) {
                                    case 1:
                                        w1.get(i).order(dine1,v1,n1);
                                        break;
                                }
                            } while (choice != 0);
                            return;
                        }
                    }
                    System.out.println("Sorry invalid name. Please try again.");
                    break;
                default:
                    if (role != 0) {
                        System.out.println("please choose an appropriate option.");
                        menu();
                    }
            }
        }while(role != 0);
    }
    public static void main(String[] args) {
        Outlet o1 = new Outlet();
        o1.menu();

    }
}

