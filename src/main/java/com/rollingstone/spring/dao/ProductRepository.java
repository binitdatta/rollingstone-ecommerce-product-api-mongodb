package com.rollingstone.spring.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rollingstone.spring.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	List<Product> findByCategory(String category);

	Product findByProductId(String productId);
}
