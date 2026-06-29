package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Category;
import com.example.demo.model.CategoryAverage;
import com.example.demo.model.Product;
import com.example.demo.model.ProductCategory;

public interface ProductDAO {

    Double getAvgPrice();

    List<CategoryAverage> getCategoryAverage();

    int insertCategory(Category category);

    List<ProductCategory> getProducts(double price);

    List<Product> getAllProducts();

}