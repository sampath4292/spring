package com.example.demo.Services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.Entity.Sales;

public interface SalesService {

    Sales saveSale(Sales sale);

    List<Sales> getAllSales();

    Sales getSaleById(Integer id);

    Sales updateSale(Sales sale);

    void deleteSale(Integer id);

    List<Sales> getSalesByProduct(String productName);

    List<Sales> getSalesByQuantity(Integer min, Integer max);

    List<Sales> getDiscountSales();

    List<Sales> getSalesAscending();

    Page<Sales> getSalesPage(int page, int size);

}