package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "saleid")
    private Integer saleId;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double soldPrice;

    @ManyToOne
    @JoinColumn(name = "proid")
    private Product product;

    public Sales() {
    }

    public Sales(Integer quantity, Double soldPrice, Product product) {
        this.quantity = quantity;
        this.soldPrice = soldPrice;
        this.product = product;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(Double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "saleId=" + saleId +
                ", quantity=" + quantity +
                ", soldPrice=" + soldPrice +
                ", product=" + product.getProName() +
                '}';
    }
}