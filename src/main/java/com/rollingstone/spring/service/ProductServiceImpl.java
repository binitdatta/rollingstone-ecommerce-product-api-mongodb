package com.rollingstone.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rollingstone.spring.dao.ProductRepository;
import com.rollingstone.spring.model.Product;

@Service
public class ProductServiceImpl  implements ProductService {

	ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product save(Product product) {
		Product savedProduct = productRepository.save(product);
		return savedProduct;
	}

	@Override
	public Product get(String id) {
		return productRepository.findByProductId(id);		

	}

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	public void update(String id, Product product) throws Exception {
		Product existingProduct = productRepository.findByProductId(id);	
		System.out.println("Existing Product :"+existingProduct);
		 if(existingProduct != null){
			    existingProduct = product;
	        	productRepository.save(existingProduct);
	        }
		 else {
			 throw new Exception("This Product does not exists");
		 }
	}

	@Override
	public boolean delete(String id) {
		 Product product = productRepository.findByProductId(id);
	        if(product != null){
	        	productRepository.delete(product);
	            return true;
	        }
	        return false;
		
	}
	
	
}
