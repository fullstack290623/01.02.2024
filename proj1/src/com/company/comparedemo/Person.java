package com.company.comparedemo;

import java.util.Objects;

public class Person implements TaxArnona, Comparable<Person> {

    // int id, String name, float height
    // protected
    // getter/setter
    // ctor
    // hashcode -- return the id
    // equals which compares 2 persons
    // to-string

    protected int id;
    protected String name;
    protected float height;
    protected int arnona;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty() && !name.isBlank() && name.length() > 1) {
            this.name = name;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public int getArnonaAmount() {
        return arnona;
    }

    public Person(int id, String name, float height, int arnona) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.arnona = arnona;
    }

    @Override
    public boolean equals(Object obj) {
        // 1 comparing this object to null
        if (obj == null) {
            return false;
        }
        // 2 comparing this object to itself
        if (this == obj) {
            return true;
        }
        // 3 comparing this object to non-Person
        if (obj instanceof Person == false) {
            return false;
        }
        // 4 comparing this object to other Person
        Person other = (Person)obj;
        return this.id == other.id && this.name.equals(other.name) && this.height == other.height
                        && this.arnona == other.getArnonaAmount();
    }

    @Override
    public int hashCode() {
        //return this.id;
        return Objects.hash(id, name, height, arnona); // "1danny1.88"
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", arnona=" + arnona +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        // if return +positive ==> p, this
        // if return -negative ==> this, p
        // if return 0         ==> order does not matter
        if (this.height > p.getHeight()) {
            return 1;
        }
        else if (p.getHeight() > this.height) {
            return -1;
        }
        return 0;
    }
}
