package ru.dimitr.springdata.entity;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String adress;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String adress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
