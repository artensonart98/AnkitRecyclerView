package com.arthur.ankitsolanki.models;

public class Source {
    private String name;
    private int id;

    public Source(String name, int id) { //we created constructors for both and we will receive paramers in it
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
