package com.firstdatabaseproject.firstdatabaseproject.impl;

import com.firstdatabaseproject.firstdatabaseproject.model.FirstTab;
import com.firstdatabaseproject.firstdatabaseproject.repository.FirstTabInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by abhi on 23/07/18.
 */

@Repository
public class FirstTabImpl implements FirstTabInterface {

    @Autowired
   JdbcTemplate jdbcTemplate;

    @Override
    public void saveData(FirstTab firstTab) {

        String sql="insert into firsttab " +
                "values(?,?,?)";

        jdbcTemplate
                .update(sql,
                new Object[]{firstTab.getId(),
                firstTab.getName(),
                firstTab.getCity()});

    }
}
