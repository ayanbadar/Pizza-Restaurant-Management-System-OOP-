package Domino;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Employee {
    Scanner sc = new Scanner(System.in);
    String username = "admin";
    String password = "fast123";

    public Manager(String name) {
        super(name);
    }


    protected void add_receptionist(ArrayList<Receptionist> r1) {
        System.out.println("Enter name of staff:");
        String name = sc.next();
        r1.add(new Receptionist(name, r1.size()+20001));
    }
    protected void add_waiter(ArrayList<Waiter> w1) {
        System.out.println("Enter name of staff:");
        String name = sc.next();
        w1.add(new Waiter(name,w1.size()+30001));
    }
    protected void assign_username_and_password_to_receptionist(Receptionist r) {
        System.out.println("Assign a username to Receptionist "+r.name);
        String u_name = sc.next();
        System.out.println("Assign a password:");
        String pass = sc.next();
        r.setUsername(u_name);
        r.setPassword(pass);
    }
    protected void del_Receptionist(ArrayList<Receptionist> r1) {
        System.out.println("Enter ID of Waiter:");

        for (int i = 0; i < r1.size(); i++) {
            System.out.println("ID: " + r1.get(i).r_id + ",     NAME: " + r1.get(i).name);
        }
        int id = sc.nextInt();
        for (int i = 0; i < r1.size(); i++) {
            if (id == r1.get(i).r_id) {
                r1.remove(i);
                System.out.println("Receptionist is fired");
            }

        }
    }
    protected void del_waiter(ArrayList<Waiter> w1) {
        System.out.println("Enter ID of Waiter:");

        for (int i = 0; i < w1.size(); i++) {
            System.out.println("ID: " + w1.get(i).w_id + ",     NAME: " + w1.get(i).name);
        }
        int id = sc.nextInt();
        for (int i = 0; i < w1.size(); i++) {
            if (id == w1.get(i).w_id) {
                w1.remove(i);
                System.out.println("Waiter is fired");
            }
        }
    }
    @Override
    void salary() {
        int salary;
        salary = 50000;

    }
}
