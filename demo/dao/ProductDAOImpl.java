package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.CatAvgmapper;
import com.example.demo.mapper.ProdCatmapper;
import com.example.demo.mapper.Prodmapper;
import com.example.demo.model.Category;
import com.example.demo.model.CategoryAverage;
import com.example.demo.model.Product;
import com.example.demo.model.ProductCategory;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Double getAvgPrice() {

        String sql = "select avg(price) from product";

        return jdbcTemplate.queryForObject(sql, Double.class);
    }

    @Override
    public List<CategoryAverage> getCategoryAverage() {

        String sql = """
                select catcode,
                avg(price) avgprice
                from product
                group by catcode
                """;

        return jdbcTemplate.query(sql, new CatAvgmapper());

    }

    @Override
    public int insertCategory(Category category) {

        String sql = """
                insert into category(catcode,catdesc)
                values(?,?)
                """;

        return jdbcTemplate.update(sql,
                category.getCatcode(),
                category.getCatdesc());

    }

    @Override
    public List<ProductCategory> getProducts(double price) {

        String sql = """
                select
                p.proname,
                c.catdesc
                from product p
                join category c
                on p.catcode=c.catcode
                where
                len(p.proname)<10
                and
                p.price>?
                """;

        return jdbcTemplate.query(sql,
                new ProdCatmapper(),
                price);

    }

    @Override
    public List<Product> getAllProducts() {

        String sql = "select * from product";

        return jdbcTemplate.query(sql, new Prodmapper());

    }

}