package com.example.demo.model;

public class ProductCategory {

    private String proname;
    private String catdesc;

    public ProductCategory() {
    }

    public ProductCategory(String proname, String catdesc) {
        this.proname = proname;
        this.catdesc = catdesc;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getCatdesc() {
        return catdesc;
    }

    public void setCatdesc(String catdesc) {
        this.catdesc = catdesc;
    }

    @Override
    public String toString() {
        return proname + "  " + catdesc;
    }

}