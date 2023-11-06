package com.cg.ecomapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.ecomapp.dto.Customer;
import com.cg.ecomapp.util.DBUtil;

public class CustomerDaoImpl implements CustomerDao {

	public void save(Customer customer) {

		String sql = "insert into customer_tbl values(?,?,?,?,?)";

		try (Connection con = DBUtil.createDBConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customer.getCustomerId());
			ps.setInt(2, customer.getAge());
			ps.setString(3, customer.getCustomerName());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getMobile());

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Customer findById(int customerId) {

		Customer customer = null;

		String sql = "select * from customer_tbl where customer_id = ?";

		try (Connection con = DBUtil.createDBConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customerId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setAge(rs.getInt(2));
				customer.setCustomerName(rs.getString(3));
				customer.setEmail(rs.getString(4));
				customer.setMobile(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}

	public List<Customer> findAll() {

		List<Customer> customerList = new ArrayList<>();

		String sql = "select * from customer_tbl";

		try (Connection con = DBUtil.createDBConnection()) {
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setAge(rs.getInt(2));
				customer.setCustomerName(rs.getString(3));
				customer.setEmail(rs.getString(4));
				customer.setMobile(rs.getString(5));
				customerList.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customerList;
	}
}
