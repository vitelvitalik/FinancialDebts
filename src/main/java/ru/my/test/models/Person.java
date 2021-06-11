package ru.my.test.models;

public class Person {
    private int id;
    private String name;
    private int debt;

    public Person(){

    }

    public Person(int id, String name, int debt) {
        this.id = id;
        this.name = name;
        this.debt = debt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDebt() { return debt; }

    public void setDebt(int debt) {
        this.debt = debt;
    }
}
