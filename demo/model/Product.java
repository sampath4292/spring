package com.example.demo.model;

public class Product {

    private int proid;
    private String proname;
    private double price;
    private int catcode;

    public Product() {
    }

    public Product(int proid, String proname, double price, int catcode) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
        this.catcode = catcode;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCatcode() {
        return catcode;
    }

    public void setCatcode(int catcode) {
        this.catcode = catcode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proid=" + proid +
                ", proname='" + proname + '\'' +
                ", price=" + price +
                ", catcode=" + catcode +
                '}';
    }
}