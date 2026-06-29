package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.*;
import com.example.demo.Repository.ProductRepo;
import com.example.demo.Services.*;
import java.util.List;



@Service
public class ProductServiceImp implements ProductService{
    
    @Autowired
    private ProductRepo repository;

    @Override
    public Product saveProduct(Product product) {

        return repository.save(product);

    }

    @Override
    public List<Product> getAllProducts() {

        return repository.findAll();

    }

    @Override
    public Product getProductById(Integer id) {

        return repository.findById(id).orElse(null);

    }

    @Override
    public Product updateProduct(Product product) {

        return repository.save(product);

    }

    @Override
    public void deleteProduct(Integer id) {

        repository.deleteById(id);

    }

}
