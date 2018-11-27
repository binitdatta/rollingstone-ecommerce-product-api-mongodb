package com.rollingstone.spring.service;

import java.util.List;


import com.rollingstone.spring.model.Product;

public interface ProductService {

   Product save(Product product);
   Product get(String id);
   List<Product> getProducts();
   void update(String id, Product product) throws Exception;
   boolean delete(String id);
}
