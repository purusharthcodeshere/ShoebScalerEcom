package com.scalerecom.scalerecom.Models;

public class Catagory {
    private long id;
    private String name;

    public Catagory() {
    }

    public Catagory(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
