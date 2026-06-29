package com.example.demo.Services;
import java.util.List;
import com.example.demo.Entity.Product;//home/sreeramkumar/Downloads/demo/src/main/java/com/example/demo/Entity/Product.java



public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Integer id);

    Product updateProduct(Product product);

    void deleteProduct(Integer id);
    
} 
