package ru.dimitr.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String adress;

//    private String sudo;

    public Person() {
    }

    public Person(String firstName, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;

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
