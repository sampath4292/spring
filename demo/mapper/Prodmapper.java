package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Product;

public class Prodmapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        Product p = new Product();

        p.setProid(rs.getInt("proid"));
        p.setProname(rs.getString("proname"));
        p.setPrice(rs.getDouble("price"));
        p.setCatcode(rs.getInt("catcode"));

        return p;
    }
}