package com.cg.ecom.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cg.ecom.dto.Product;
import com.cg.ecom.util.DBUtil;

public class ProductDaoImpl {
	
	public void save(Product product) {
		
		String sql = "insert into product_tbl values (?,?,?,?,?)";
		
		try(Connection con = DBUtil.createDBConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setDouble(3, product.getProductPrice());
			ps.setDate(4, Date.valueOf(product.getMfd()));
			ps.setString(5, product.getCategory());
			
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Product findById(int productId) {		
		
		Product product = null;		
		
		try(Connection con = DBUtil.createDBConnection()) {
			String sql = "select * from product_tbl where product_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//get values from ResultSet
				int pId= rs.getInt(1);
				String pName = rs.getString(2);
				double pPrice = rs.getDouble(3);
				LocalDate pMfd = rs.getDate(4).toLocalDate();
				String pCategory = rs.getString(5);
				
				//create product object and set the values from ResultSet
				product = new Product();
				product.setProductId(pId);
				product.setProductName(pName);
				product.setProductPrice(pPrice);
				product.setMfd(pMfd);
				product.setCategory(pCategory);
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return product;
	}
	
	public List<Product> findAll() {
		
		List<Product> productList = new ArrayList<>();		
		String sql = "select * from product_tbl";		
		try(Connection con = DBUtil.createDBConnection()) {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int pId= rs.getInt(1);
				String pName = rs.getString(2);
				double pPrice = rs.getDouble(3);
				LocalDate pMfd = rs.getDate(4).toLocalDate();
				String pCategory = rs.getString(5);
				
				//create product object and set the values from ResultSet
				Product product = new Product();
				product.setProductId(pId);
				product.setProductName(pName);
				product.setProductPrice(pPrice);
				product.setMfd(pMfd);
				product.setCategory(pCategory);
				//add to the list
				productList.add(product);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}
}
