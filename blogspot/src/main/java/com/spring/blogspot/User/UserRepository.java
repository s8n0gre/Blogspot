package com.spring.blogspot.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

      public int insertUser(user u) {
        String sql = "INSERT INTO users (u_id, name, password, age, gender, specialization) VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                u.getU_id(),
                u.getName(),
                u.getPassword(),
                u.getAge(),
                u.getGender(),
                u.getSpecialization()
        );
    }
    public List<user> findAll() {
        String sql = "SELECT * FROM users"; // assuming table name is `users`
        return jdbcTemplate.query(sql, new RowMapper<user>() {
            @Override
            public user mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new user(
                    rs.getString("name"),
                    rs.getString("password"),
                    rs.getInt("age"),
                    rs.getString("gender"),
                    rs.getString("specialization"),
                    rs.getString("u_id")
                );
            }
        });
    }
}
