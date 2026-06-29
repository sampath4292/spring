package com.example.demo.model;

public class Category {

    private int catcode;
    private String catdesc;

    public Category() {
    }

    public Category(int catcode, String catdesc) {
        this.catcode = catcode;
        this.catdesc = catdesc;
    }

    public int getCatcode() {
        return catcode;
    }

    public void setCatcode(int catcode) {
        this.catcode = catcode;
    }

    public String getCatdesc() {
        return catdesc;
    }

    public void setCatdesc(String catdesc) {
        this.catdesc = catdesc;
    }

    @Override
    public String toString() {
        return catcode + " " + catdesc;
    }

}