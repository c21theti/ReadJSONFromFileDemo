package com.example.readjsonfromfiledemo;

import androidx.annotation.NonNull;

public class mountain {
    private String name;
    private String location;
    private int size;

    public mountain(String name, String location, int size) { //constructor : alt + insert
        this.name = name;
        this.location = location;
        this.size = size;
    }

    public String getName() { //getter and setter : alt + insert
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @NonNull
    @Override
    public String toString() {
        return name + "has an altitude of" + size + "m above sea level";  //override methods: alt + insert
    }
}
