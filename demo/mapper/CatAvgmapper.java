package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.CategoryAverage;

public class CatAvgmapper implements RowMapper<CategoryAverage> {

    @Override
    public CategoryAverage mapRow(ResultSet rs, int rowNum) throws SQLException {

        CategoryAverage obj = new CategoryAverage();

        obj.setCatcode(rs.getInt("catcode"));
        obj.setAvgprice(rs.getDouble("avgprice"));

        return obj;

    }

}