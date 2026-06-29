package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Sales;
import com.example.demo.Repository.SalesRepository;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesRepository repository;

    @Override
    public Sales saveSale(Sales sale) {
        return repository.save(sale);
    }

    @Override
    public List<Sales> getAllSales() {
        return repository.findAll();
    }

    @Override
    public Sales getSaleById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Sales updateSale(Sales sale) {
        return repository.save(sale);
    }

    @Override
    public void deleteSale(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Sales> getSalesByProduct(String productName) {
        return repository.findByProductProName(productName);
    }

    @Override
    public List<Sales> getSalesByQuantity(Integer min, Integer max) {
        return repository.findByQuantityBetween(min, max);
    }

    @Override
    public List<Sales> getDiscountSales() {
        return repository.getDiscountSales();
    }

    @Override
    public List<Sales> getSalesAscending() {
        return repository.findAllByOrderByQuantityAsc();
    }

    @Override
    public Page<Sales> getSalesPage(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

}