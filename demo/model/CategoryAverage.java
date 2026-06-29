package com.example.demo.model;

public class CategoryAverage {

    private int catcode;
    private double avgprice;

    public CategoryAverage() {
    }

    public CategoryAverage(int catcode, double avgprice) {
        this.catcode = catcode;
        this.avgprice = avgprice;
    }

    public int getCatcode() {
        return catcode;
    }

    public void setCatcode(int catcode) {
        this.catcode = catcode;
    }

    public double getAvgprice() {
        return avgprice;
    }

    public void setAvgprice(double avgprice) {
        this.avgprice = avgprice;
    }

    @Override
    public String toString() {
        return catcode + "  " + avgprice;
    }

}