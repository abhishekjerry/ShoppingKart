package com.dxc.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.model.Products;

public interface ProductRepository extends MongoRepository<Products, String> {

}
