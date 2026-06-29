package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.ProductCategory;

public class ProdCatmapper implements RowMapper<ProductCategory> {

    @Override
    public ProductCategory mapRow(ResultSet rs, int rowNum) throws SQLException {

        ProductCategory obj = new ProductCategory();

        obj.setProname(rs.getString("proname"));
        obj.setCatdesc(rs.getString("catdesc"));

        return obj;

    }

}