package Domino;

public abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    abstract void salary();

}
