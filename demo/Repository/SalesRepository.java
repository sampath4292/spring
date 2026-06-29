package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {

    // Q7(a)
    List<Sales> findByProductProName(String proName);

    // Q7(b)
    List<Sales> findByQuantityBetween(Integer min, Integer max);

    // Q7(c)
    @Query("""
            select s
            from Sales s
            where s.soldPrice < s.product.price
            """)
    List<Sales> getDiscountSales();

    // Q7(d)
    List<Sales> findAllByOrderByQuantityAsc();

    // Q7(e)
    Page<Sales> findAll(Pageable pageable);

}