package com.cg.ecomapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.ecomapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	Optional<Product> findByProductName(String name);
	
	List<Product> findByCategory(String categoryName);
	
	@Query("select p from Product p where p.productPrice <= :pprice")
	List<Product> findProductsUnderPrice(@Param("pprice") double price);
	
	@Query("select p from Product p where p.productPrice between :lPrice and :uPrice order by p.productPrice")
	List<Product> findProductsWithInPriceRange(@Param("lPrice") double lowerPrice, @Param("uPrice") double upperPrice);

}
