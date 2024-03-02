package com.raisetech8.mybatisdemo;

public class Name {
    private int id;
    private String name;
    private String country;

    public Name(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
