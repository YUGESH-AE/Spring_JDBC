package com.example.spring_jdbc.repository;

import com.example.spring_jdbc.enity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SuppressWarnings("all")
@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    @Override
//    public void insert(Customer customer) {
//        String insert="INSERT INTO customer(phone_no,name,age,gender,address,plan_id) Values (?,?,?,?,?,?)";
//        jdbcTemplate.update(insert,customer.getPhoneNumber(),customer.getName(),customer.getAge(),customer.getGender(),customer.getAddress(),customer.getPlanId());
//
//    }
@Override
public void insert(Customer customer) {
    String query = "INSERT INTO customer(phone_no,name,age,gender,address,plan_id) Values (:phoneNo,:name,:age,:gender,:address,:planId)";
    SqlParameterSource namedParam = new MapSqlParameterSource("phoneNo", customer.getPhoneNumber())
            .addValue("name", customer.getName()).addValue("age", customer.getAge())
            .addValue("gender", customer.getGender().toString()).addValue("address", customer.getAddress())
            .addValue("planId", customer.getPlanId());
    namedParameterJdbcTemplate.update(query, namedParam);
}

    @Override
    public int remove(Long phoneNo) {
        return jdbcTemplate.update("delete from customer where phone_no = ? ",phoneNo);
    }

    @Override
    public List<Customer> getAll() {
        String get="select phone_no, name ,age, gender, address, plan_id from customer";
        return jdbcTemplate.query(get, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Customer cust = new Customer();
                cust.setName(rs.getString("name"));
                cust.setPhoneNumber(rs.getLong("phone_no"));
                cust.setAge(rs.getInt("age"));
                cust.setGender(rs.getString("gender"));
                cust.setAddress(rs.getString("address"));
                cust.setPlanId(rs.getInt("plan_id"));
                return cust;
            }
        });
    }

    @Override
    public int getCount() {
        String sql = "Select count(*) from customer";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    @Override
    public int update(Long phoneNo, String address) {
        String query = "update customer set address = ? " + " where phone_no = ?";
        return jdbcTemplate.update(query, address, phoneNo);
    }

    @Override
    public Customer get(Long phoneNo) {
        String sql = "select * from customer where phone_no = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] {phoneNo}, new RowMapper<Customer>() {
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Customer cust = new Customer();
                cust.setName(rs.getString("name"));
                cust.setPhoneNumber(rs.getLong("phone_no"));
                cust.setAge(rs.getInt("age"));
                cust.setGender(rs.getString("gender"));
                cust.setAddress(rs.getString("address"));
                cust.setPlanId(rs.getInt("plan_id"));
                return cust;
            }
        });
    }
}
