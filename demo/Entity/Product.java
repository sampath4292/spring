package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name="Product")
public class Product {
    
    @Id
    @Column(name = "Prod_id")
    private Integer proId;
    @Column(name = "proname", nullable = false, length = 100)
    private String proName;

    @Column(nullable = false)
    private Double price;

    public Product(){}

    public Product(Integer a,String b,Double c)
    {
        this.proId=a;
        this.proName=b;
        this.price=c;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }

    @OneToMany(mappedBy = "product")
    private List<Sales> sales;

}
